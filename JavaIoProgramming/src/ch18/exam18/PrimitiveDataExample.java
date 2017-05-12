/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch18.exam18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
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
public class PrimitiveDataExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int value=10;
        OutputStream os=new FileOutputStream("src/ch18/exam18/test.dat");//int 는 문자가 아니라서.txt 에 저장해도 의미가 없다. binary
        //정수 10은 문자가 아니다.
        DataOutputStream dos=new DataOutputStream(os);
        
        dos.writeInt(value);
        dos.writeDouble(2.5);
        dos.writeUTF("자바");
        dos.flush();
        dos.close();
        InputStream is=new FileInputStream("src/ch18/exam18/test.dat");
        DataInputStream dis=new DataInputStream(is);
        int readValue= dis.readInt();
        double readValue1=dis.readDouble();
        System.out.println(readValue);
        System.out.println(readValue1);
        dis.close();
        is.close();
    }
}
