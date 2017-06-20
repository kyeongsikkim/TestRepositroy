package com.mycompany.myapp.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mycompany.myapp.service.SensingCarService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class SensingCarController {
	
	private static final Logger logger = LoggerFactory.getLogger(SensingCarController.class);
	
	@Autowired 
	private SensingCarService sensingCarService;
	

	@RequestMapping("/ultrasonicsensor")//ajax 에서 호출 한다. json 또는 
	public void ultrasonicsensor(@RequestParam (defaultValue="90") int angle,HttpServletResponse response)throws Exception{
		sensingCarService.changeUltrasonicSensorAngle(angle);
		Thread.sleep(500);
		int distance=sensingCarService.getUltrasonicSensorDistance();
		//여기서 만들어 지는 json 은 {"distance":"30"}
		//int distance=100;
		JSONObject jsonObject=new JSONObject();//라이브러리 필요하다.JSON 사용할려면  maven 저장소에서 JSON 을 받는다.void 타입이라는 것은 jsp 로 보여주는 것이 아니다.
		jsonObject.put("distance", distance);
		String json=jsonObject.toString();
		
		response.setContentType("application/json;charset=UTF-8");
		PrintWriter pw=response.getWriter();
		pw.write(json);
		pw.flush();
		pw.close();
		
	}
	@RequestMapping("/gassensor")
	public void gassensor(HttpServletResponse response) throws Exception{
		double value=sensingCarService.getGasSensorValue();
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("gas",value);
		String json=jsonObject.toString();
		
		response.setContentType("application/json;charset=UTF-8");
		PrintWriter pw=response.getWriter();
		pw.write(json);
		pw.flush();
		pw.close();
		
		
	}
	
}
