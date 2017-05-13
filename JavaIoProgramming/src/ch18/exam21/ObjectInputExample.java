/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch18.exam21;

import ch18.exam20.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Administrator
 */
public class ObjectInputExample {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
    
    FileInputStream fis= new FileInputStream("src/ch18/exam20/object.dat");
    ObjectInputStream ois=new ObjectInputStream(fis);
    
    Member member=(Member)ois.readObject();
     //보낼때랑 받을때랑 같다.
    ois.close();
    fis.close();
        System.out.println(member.getname());
        System.out.println(member.getAge());
        System.out.println(Member.nation);
    }   
  }
