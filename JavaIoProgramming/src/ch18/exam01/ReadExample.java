package ch18.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println("Hello Netbeans");
        String path = ReadExample.class.getResource("test.txt").getPath();
        InputStream is = new FileInputStream(path);
        while (true) {
            int v1 = is.read();
            System.out.println(v1);
            if (v1 == -1) {//읽을게 없으면 -1을 리턴한다. 한바이트씩 읽어오다가 -1을 리턴하면 종료시킨다.
                break;
            }

            System.out.print((char) v1);//int 형을 문자로 
        }
        ///////////////////////////////////////////////////
        int i = -1;
        while ((i = is.read()) != -1) {
            System.out.println((char) i);//한글은 무조건깨진다 한글은 기본이 2byte 이기 때문에 1byte 로불러오는 것은 깨진다
        }
       
    }
    
}
//컴파일 F6 
