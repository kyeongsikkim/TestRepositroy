
package ch18.exam13;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class InputStreamreaderExample {
    public static void main(String[] args) throws IOException {
        /*InputStream is =System.in;//머가 올지 모른다. 파일로 부터 얻을 수도 키보드로 부터 얻을 수도 있다.
        InputStreamReader isr=new InputStreamReader(is);
        int data=isr.read();//한글도 깨진다 영어만 1byte 라서 2byte 씩 읽는다.
       
        System.out.println((char)data);
        Reader reader=
*/
        InputStream is=new FileInputStream("src/ch18/exam13/test2.txt");
        InputStreamReader isr=new InputStreamReader(is,"EUC-KR");//생략해도 UTF-8이다.
        int data=isr.read();
        System.out.println((char)data);
    }
}
