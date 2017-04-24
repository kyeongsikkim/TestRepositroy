package ch18.exam07;

import ch18.exam06.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {
    //영어도 한문자로 취급한다. 문자는 다 2byte 로 취급한다.자바는 다 2byte 로 취급한다. 영어 한글 저장하지 않고 
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path = ReadExample.class.getResource("test.txt").getPath();
        Reader reader=new FileReader(path);
      char []data=new char[3];
       int readBytes=reader.read(data);
       String str=new String(data);
        System.out.println(str+"-"+readBytes);
         
         readBytes=reader.read(data);
        str=new String(data);
        System.out.println(str+"-"+readBytes);
        
         readBytes=reader.read(data);
         str=new String(data,0,1);
        System.out.println(str+"-"+readBytes);
        
        reader.close();
    }
    
}
//컴파일 F6 
//UTF-8 3byte 를 2byte 로 바꿔서 프로그램에 inputstream 해준다
