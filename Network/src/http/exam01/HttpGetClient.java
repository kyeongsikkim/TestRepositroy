package http.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONObject;

public class HttpGetClient {
	//웹서버와 통신을 할려면 httpClient 4.5 와 3.0 의 방식이 다르다.httpClient 라이브러리 
	public static void main(String[] args) throws IOException {
		//닫혀질수있는 http클라이언트 코드상으로 닫을수 있는 http client 이다.응답이 오기전에도 끊고 싶으면 끊을 수 있다.
		CloseableHttpClient httpClient = HttpClients.createDefault();//get 방식 포스트 방식으로 전송 할 수 있다.
		try {
			//urlbuilder 로 값을 넘겨 줬다가 받아오는 받는 것이다.
			URIBuilder uriBuilder = new URIBuilder("http://192.168.3.131:8080/IoTWebProgramming/http/exam01");
			uriBuilder.setParameter("thermistor", String.valueOf(25));
			uriBuilder.setParameter("photoresistor", String.valueOf(200));
			HttpGet httpGet = new HttpGet(uriBuilder.build());//get 방식으로 보내고 싶으면 http get 을 만들어 낸다.
			CloseableHttpResponse response = httpClient.execute(httpGet);//실행하라는 것을 집어 넣는다.execute 을 할때 실제 요청이 들어간다.동기방식이다. 응답이 올때까지 블로킹 된다.
			try {
				HttpEntity resEntity = response.getEntity();//http 프로토콜 본문에 있는 내용의 전체를 가지고 있는 객체 
				if (resEntity != null) {
					InputStream is = resEntity.getContent();//내용을 읽을때 사용하는 것이다.
					try {
						InputStreamReader isr = new InputStreamReader(is);//bufferreader 로 읽는다.
						BufferedReader br = new BufferedReader(isr);//문자를 다읽어서 
						String json = "";//변수에 저장을 시키 겠다.
						while(true) {
							String data = br.readLine();//리드라인을 사용할 수 있다.
							if(data == null) break;
							json += data;
						}
						JSONObject jsonObject = new JSONObject(json);//문자열 파싱하기 위해서 
						double thermistor = jsonObject.getDouble("thermistor");
						double photoresistor = jsonObject.getDouble("photoresistor");
						System.out.println("thermistor: " + thermistor);
						System.out.println("photoresistor" + photoresistor);
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						is.close();
					}
				}
			} finally {
				response.close();
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			httpClient.close();
		}
	}
}


//public class HttpGetClient {
//
//	public static void main(String[] args) throws IOException {
//		CloseableHttpClient httpclient = HttpClients.createDefault();
//		try {
//			HttpGet httpget = new HttpGet("http://192.168.3.131:8080/IoTWebProgramming/http/exam01?thermistor=25&photoresistor=200");
//			CloseableHttpResponse response = httpclient.execute(httpget);
//			try {
//				HttpEntity entity = response.getEntity();
//				if (entity != null) {
//					InputStream instream = entity.getContent();
//					try {
//						InputStreamReader isr = new InputStreamReader(instream);
//						BufferedReader br = new BufferedReader(isr);
//						String json = "";
//						while(true) {
//							String data = br.readLine();
//							if(data == null) break;
//							json += data;
//						}
//						JSONObject jsonObject = new JSONObject(json);
//						String temperature = jsonObject.getString("temperature");
//						System.out.println(temperature);
//					} catch (Exception e) {
//						e.printStackTrace();
//					} finally {
//						instream.close();
//					}
//				}
//			} finally {
//				response.close();
//			}
//		} catch(Exception e) {
//			e.printStackTrace();
//		} finally {
//			httpclient.close();
//		}
//	}
//}