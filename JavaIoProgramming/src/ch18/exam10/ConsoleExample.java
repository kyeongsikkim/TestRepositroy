/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18.exam10;

import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ConsoleExample {
    public static void main(String []args) throws IOException{
    //int keycode=System.in.read();
    
    InputStream is=System.in;
    //int keycode=is.read();//한바이트 읽는다
    ////////////////////////////////how1////////////////////////////////
    byte[]keycodes=new byte[100];
    int readByte=is.read(keycodes);
        System.out.println(Arrays.toString(keycodes));
    String str=new String(keycodes,0,readByte-2);//문자열로 변환 하는것
        System.out.println(str);
        /////////////////////how2//////////
        Scanner scanner=new Scanner(System.in);
        String str2=scanner.nextLine();
        System.out.println(str2);
        /////////how3////////////////////////
        Console console=System.console();
        String str3=console.readLine();
        System.out.println(str3);
    }
}
/*
넷빈즈설치경로\etc\netbeans.conf 파일을 열어 보면 아래와 같은 부분이 
실제 console 에서 테스트를 한다.실행파일이 있는 곳에서 현재 창에서 명령창을 열어서 확인을 한다.

*/
