/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch18.exam19;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 *
 * @author Administrator
 */
public class LineDataExample {
    public static void main(String[] args) throws IOException {
       FileOutputStream fos=new FileOutputStream("src/ch18/exam19/test.txt");
       PrintStream out=new PrintStream(fos);//행단위 출력할때는 printStream
       out.println("abcde");
       out.println("12345");
       out.print("가나다라마");
       out.flush();
       fos.flush();
       out.close();
       fos.close();
       
       FileInputStream fis=new FileInputStream("src/ch18/exam19/test.txt");
       InputStreamReader isr=new InputStreamReader(fis);
       BufferedReader br=new BufferedReader(isr);//행단위 읽을 때는 buffered 로 
       while(true){
           String line=br.readLine();
           if(line==null)break;//readLine 은 읽을게 없으면 null 을 리턴한다.
           System.out.println(line);
       }
       br.close();
       isr.close();
       fis.close();
       
       /*
       OutputStreamWriter osw=new OutputStreamWriter(fos);
        osw.write("abced\r\n");
        osw.write("12345\r\n");
        osw.write("가나다라마");
        osw.flush();
        fos.flush();
        osw.close();
        fos.close();
*/
//       
//        FileWriter fw=new FileWriter("src/ch18/exam19/test.txt");
//       
//        fw.write("abced\r\n");
//        fw.write("12345\r\n");
//        fw.write("가나다라마");
    }
}
