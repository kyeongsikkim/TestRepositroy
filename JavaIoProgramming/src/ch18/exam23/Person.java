/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch18.exam23;

/**
 *
 * @author Administrator
 */
public class Person {
  
       private String name;
       private int age;
       
    public Person() {
    }

       
    public Person(String name,int age) {
        this.name = name;
        this.age=age;
    }
    

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
       
       
}
