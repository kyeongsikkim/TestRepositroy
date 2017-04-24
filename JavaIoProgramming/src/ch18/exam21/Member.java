/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch18.exam21;

import ch18.exam20.*;
import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class Member implements Serializable{//사용 설명서에 관련된 추상 메소드가 있어야 하지만 아무것도 없다 이객체를 다른곳에 보내도 된다는 허가 사항 외부로 보내도 안되고 파일로 보내면 안되 이럴경우는 serializable 를 붙이면 안된다.
   
    private String name;
    private int age;
    public static String nation="한국";//멤버에서 스태틱은 직렬화 대상이 되지 않는다.
   public Member(String name,int age){
       this.name=name;
       this.age=age;
   } 

    public String getname() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setMname(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
   
}
