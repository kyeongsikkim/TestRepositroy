/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18.exam09;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 *
 * @author Administrator
 */
public class CopyExample {
     public static void main(String[] args) throws IOException {
         String path=CopyExample.class.getResource("test.txt").getPath();
         Reader reader=new FileReader(path);
         Writer writer=new FileWriter("src/ch18/exam09/test2.txt");
         char[]data=new char[3];
         int readChars=-1;
         while(true){
             readChars=reader.read(data);
             if(readChars==-1)break;
             else{
                 writer.write(data,0,readChars);
             }
         }
     writer.flush();
     writer.close();
     reader.close();
         
     }
}
