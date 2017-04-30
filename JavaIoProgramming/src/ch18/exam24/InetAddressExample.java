

package ch18.exam24;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Administrator
 */
public class InetAddressExample {
    public static void main(String[] args) throws UnknownHostException {
        
    InetAddress ia=InetAddress.getLocalHost();
    String address=ia.getHostAddress();
        System.out.println(address);
        System.out.println(address);
        InetAddress iaNaver=InetAddress.getByName("www.naver.com");
        String addressNaver=iaNaver.getHostAddress();
        System.out.println(addressNaver);
        
        InetAddress []iaNavers=InetAddress.getAllByName("www.sw.or.kr");//운영하는 서버를 알 수 있다.
        for(InetAddress i:iaNavers){
            System.out.println(i.getHostAddress());
        }
    }
    }
    
//현재 장비 아이피 주소를 먼저 알고서 활용 가능하다

//IPv6 은 장치에 부여된 ip 코드 장비 하나당 하나만 갖고 있다
//Ipv4 는 고정이 아니다. DNS 서버에서 할당 받는것 OS 에서 셋팅 가능
//서브넷 마스크 여기있는 피시와 다른 피시가 같은 지역내에 있는냐 같은 지역에 있고
//같은 지역 네트워크의 ip 가 머냐 
//DNS 
//물리적 주소 맥어드레스 
//임대만료날짜 ip 주소가 한번 바뀔 수도 있다.
//네트워크 어떤 프로그램으로 연결할건지 운영체제마다 식별하기 위해서 포트를 가지고 있어야 한다.
//배가 정차하는것처럼 연결하기 위해서는ip 주소와 port
//Domain name system->도메인 이름을 ip주로소 바꾸주는것 
//프로세스 연결할려면 ip 랑 port 외부프로세스 연결하기 위해서 DNS 가xxx.xxx.xxx.라고 알려준다.
//ip 를 가지고 연결해야된다. 80 xxx.xxxx.xxxx 80 으로 접근을 한다.
//도메인한테 먼저 접근을 해야된다. 도메인도 프로세스이기 때문에 
//부모가 seriallizable 를 구현을 안하면 부모 필드는 직렬화 안된다.
//네트워크 로컬영역 들어가서 속성 TCP/IPv4확인
//도메인가서 ip 를 얻어와서 서버에 접근해준다.
//자기 자신의 객체 주소를 리턴해주는 메소드가 있나 확인
//TCP transmission control protocol 연결지향적
//TCP는 연결 지향 적이다. 안정적이고 통신서로 고정적이다.
//UDP는 연결지향이 아니다. 통신선로가 고정적이지 않고 안정적이지 않다.
//TCP 는 연결하는데 시간이 걸리는데UDP 는 연결하는데 시간이 필요하지 않다.
//물리계층, 데이터 링크 계층 ,네트워크 계층, 전송계층, 세션계층, 표현 계층, 응용계층
//물리계층은 -선:데이터가 선따라 간다
//데이터 링크계층-네트워크 어댑터
//네트워크 계층-프로토콜이 어디 아이피로 가야하나
//전송계층 -TCP
//세션:상태유지할거냐 말거냐
//어플리케이션 프로토콜:HTTP
//osi 7계층 물리적 계층 데이터 링크 꼐층 네트워크 계층 전송계층 세션계층 
//응용은 우리가 만든 프로그램 에서 사용하는 프로토콜 내려갈수록 헤더가 붙는다.
//ex 웹서버에서 만든 데이터 data/http protoctol/TCP/네트워크 IP
//선 망 물리적 랜카드 데이터 링크 계층 
//응용프로토콜 