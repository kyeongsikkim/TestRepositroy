package ch18.exam06;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path = ReadExample.class.getResource("test.txt").getPath();
        Reader reader=new FileReader(path);
        String str="";
        int data=-1;
        while(true){
        data=reader.read();//리드는 한문자를 읽어 들인다.
            System.out.println(data);//한글이라서 3바이트 3바이트는 
        if(data==-1)break;
        else
        str+=(char)data;
        }
        System.out.println(str);
       reader.close();
    }
    
}
//컴파일 F6 
