package ch18.exam08;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

    //영어도 한문자로 취급한다. 문자는 다 2byte 로 취급한다.자바는 다 2byte 로 취급한다. 영어 한글 저장하지 않고 
    public static void main(String[] args) throws FileNotFoundException, IOException {
       Writer writer=new FileWriter("src/ch18/exam08/test.txt");
       
       char c1='가';
       char []c2={'나','다','라'};
       writer.write(c1);
       writer.write(c2);
       writer.write("마바사아");//이렇게 해도 배열로 관리가 된다.
       writer.write(c2,0,2);
       writer.flush();
       writer.close();
    }

}
//컴파일 F6 
