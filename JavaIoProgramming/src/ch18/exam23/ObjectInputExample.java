/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch18.exam23;

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
        
    
    FileInputStream fis= new FileInputStream("src/ch18/exam23/object.dat");
    ObjectInputStream ois=new ObjectInputStream(fis);
    
    VVIP vvip=(VVIP)ois.readObject();
     //보낼때랑 받을때랑 같다.
        System.out.println(vvip.getName());
         System.out.println(vvip.getAge());
          System.out.println(vvip.getGrade());
        System.out.println(vvip.getMemberShipNo());
    
     ois.close();
    fis.close();
    }   
  }
