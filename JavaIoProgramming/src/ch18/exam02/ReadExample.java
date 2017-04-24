package ch18.exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class ReadExample {

    public static void main(String[] args) throws FileNotFoundException, IOException {
      
        String path = ReadExample.class.getResource("test.txt").getPath();
        InputStream is = new FileInputStream(path);
       
        byte[]data=new byte[3];//최대 한번에 3byte 씩 읽는다.
        int readBytes=-1;
       /* String aa="bb";
        aa+="안녕";
        string 합치기
         System.out.println(aa);
        */ 
      
        String strData="";
        while(true){
        readBytes=is.read(data);//readBytes 를 보고서 몇바이트 읽혔나 확인 가능하다.is.read 의 리턴값은 int 형이다.데이터에 3바이트씩 넣어서 1바이트씩 해준다.
        if(readBytes==-1) break;
        System.out.println("읽은 바이트 수"+readBytes);
        System.out.println(Arrays.toString(data));
        strData+=new String(data,0,readBytes);//배열에 몇바이트가 들어가 있는지 모르니까 
        }
        //String strData=new String(data);data 를 새로운 문자열로 만들어주는 것 
         System.out.println("---------------------------------------------------------");
        System.out.println(strData);//데이터 변경시켜준다 string 형태로 
        System.out.println("----------------------------------------------------------");
        is.close();
        /*
        readBytes=is.read(data);
        System.out.println("읽은 바이트 수"+readBytes);
        System.out.println(Arrays.toString(data));
        */
       }
    
}
//컴파일 F6 
