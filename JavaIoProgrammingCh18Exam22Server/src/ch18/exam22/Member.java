/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch18.exam22;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class Member implements Serializable{//사용 설명서에 관련된 추상 메소드가 있어야 하지만 아무것도 없다 이객체를 다른곳에 보내도 된다는 허가 사항 외부로 보내도 안되고 파일로 보내면 안되 이럴경우는 serializable 를 붙이면 안된다.
    private static final long serialVersionUID=1;//다르면 다른 객체로 간주한다.
    private String name;
    private int age;
    private String job;//위에 시리얼 넘버가 없다면은 필드가 추가 되었을 때는 다른 객체로 간주를 한다 그러나 시러얼 버전이 같다면 같은 타입으로 추가 된다.
    //클래스 이름은 같아야 한다. 시리얼 버전이 같다면은 같은 타입으로 간주를 한다. 
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
