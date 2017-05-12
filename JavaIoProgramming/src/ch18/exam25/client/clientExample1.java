/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18.exam25.client;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;


/**
 *
 * @author Administrator
 */
public class clientExample1 {

    public static void main(String[] args) {
        Socket socket = null;
        //how1
        //socket = new Socket("192.168.3.28", 50001);//서버의 ip 주소 서버와 클라이언트 동일한 컴퓨터에서 돌리기 때문에
        //위에꺼는 소켓을 만들고서 바로 연결 요청이 된다.
        try{
            //소켓 생성
        socket=new Socket();
        //연결 요청 
        socket.connect(new InetSocketAddress("192.168.3.28", 50001));
        }catch(IOException ex){
            ex.printStackTrace();
        }
        if (socket.isClosed()) {
            try {
                socket.close();
            } catch (IOException ex) {
            }
        }
    }
}
