
package ch18.exam14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;


public class OutputStreamWriterExample {
    public static void main(String[] args) throws IOException {
        
    
    //OutputStream os=System.out;//뒤에는 다양한게 온다 머가올지 모른다. fileoutputstream 이 올 수도 있다.
    OutputStream os=new FileOutputStream("src/ch18/exam14/test.txt");
 //outputStream 은 byte 로 보내야 되서 반환하는 것이 필요한다.
    OutputStreamWriter osw=new OutputStreamWriter(os);
   // byte[]data="가".getBytes();
    //os.write(data);
    osw.write("가");
    osw.flush();
    osw.close();
}
}
//프린트 예시 프린트대기문서들이 기다리고 있다.버퍼의 크기가 적을 경우 필요가 없다.