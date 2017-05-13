package ch18.exam03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriterExample {

    public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
      
        //String path = WriterExample.class.getResource("test.txt").getPath();
        //OutputStream os=new FileOutputStream(path);
        OutputStream os=new FileOutputStream("src/ch18/exam03/text.txt");
        os.write(97);//-128~127 1byte데이터가 다 안채워지면 들어가지 않는다.
        os.flush();
        //Thread.sleep(1000000000);//알트 엔터
        for(int i=0;i<20;i++){
            os.write(97);
        }
       
 

       }
    
}
/*
실제 출력이 되는 경우 
내부 출력 버퍼가 자동으로 채워졌을 경우 자동으로 flush 를 해준다.
명시적으로 flush()호출할 경우 
출력스트림을 close() 닫을 경우 
프로세스가 종료 되면은 자동으로  close 가 된다.파일입출력 항상 close 된 상태로 마무리가 되어야 한다.
*/
//컴파일 F6 
//shift F6
