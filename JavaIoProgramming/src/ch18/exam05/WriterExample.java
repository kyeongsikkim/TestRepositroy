package ch18.exam05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class WriterExample {

    public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
        InputStream is=new FileInputStream("src/ch18/exam05/text.txt");
        OutputStream os=new FileOutputStream("src/ch18/exam05/text2.txt");
        byte[]data=new byte[4];//한번에 4씩 읽어 올수 있다.
        int readByte=-1;
        while(true){
            readByte=is.read(data);
            if(readByte==-1)break;
            else{
                os.write(data,0,readByte);
            }
        }
        
        
        
        //byte[]data1="abc".getBytes();
        is.close();
        os.flush();
        os.close();
        
       
 

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
