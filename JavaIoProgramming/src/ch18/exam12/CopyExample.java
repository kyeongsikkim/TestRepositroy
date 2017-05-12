/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18.exam12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author Administrator
 */
public class CopyExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
       InputStream is=new FileInputStream("src/ch18/exam12/Desert.jpg");
       OutputStream os=new FileOutputStream("src/ch18/exam12/Desert2.jpg");
        
        byte[]data=new byte[1024];//1024kb 
        int readBytes=-1;
        while(true){
            readBytes=is.read(data);
              if(readBytes==-1)break;
            os.write(data,0,readBytes);
           
        }
        os.flush();
        os.close();
        is.close();
    //머무르는게 적게 하고 빠르게 전송하는게 좋다.
    }
}
//경로얻고->몇바이트씩 읽을지 정하고->바이트로 읽고 ->문자여롤 변환한다.
