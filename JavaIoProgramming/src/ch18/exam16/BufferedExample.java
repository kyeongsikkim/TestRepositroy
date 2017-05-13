
package ch18.exam16;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;


public class BufferedExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
       OutputStream os=new FileOutputStream("src/ch18/exam16/test.txt");
       OutputStreamWriter osw=new OutputStreamWriter(os);
       BufferedWriter bw=new BufferedWriter(osw);
      
       for(int i=0;i<1000;i++){
        bw.write("가나다");
        
       }
        
        bw.flush();//끝 보내야 다음에 들어올 수 있으니까 가장 마지막 보조스트림을 먼저비워야 한다. 
        osw.flush();
        os.flush();
        bw.close();//프로그램에 가까운 것부터 닫아야 한다.마지막꺼를 먼저 닫아야한다.
        osw.close();
        os.close();
    }
}
