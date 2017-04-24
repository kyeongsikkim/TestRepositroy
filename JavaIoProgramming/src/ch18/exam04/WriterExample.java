package ch18.exam04;

import ch18.exam03.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriterExample {

    public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
      
      
        OutputStream os=new FileOutputStream("src/ch18/exam04/text.txt");
        byte[]data={97,98,99};
        //byte[]data1="abc".getBytes();
        os.write(data);//-128~127 1byte데이터가 다 안채워지면 들어가지 않는다.
        os.flush();
    
       
 

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
