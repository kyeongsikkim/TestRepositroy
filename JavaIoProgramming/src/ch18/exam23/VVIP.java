/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch18.exam23;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class VVIP extends Person implements Serializable{
    private int memberShipNo;
    private String grade;

    public VVIP() {}
    
    public VVIP(int memberShipNo,String grade, String name,int age) {
        super(name,age);
        this.grade=grade;
        this.memberShipNo = memberShipNo;
    }

    public int getMemberShipNo() {
        return memberShipNo;
    }

    public void setMemberShipNo(int memberShipNo) {
        this.memberShipNo = memberShipNo;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    
    
private void writeObject(ObjectOutputStream out)throws IOException,ClassNotFoundException{
    out.writeUTF(getName());//부모메소드 사용가능 하다.부모 내용을 직접 출력하고
    out.writeInt(getAge());
    out.defaultWriteObject();//자신의 필드를 직렬화
}
private void readObject(ObjectInputStream in)throws IOException,ClassNotFoundException{
    setName(in.readUTF());//읽는다.
    setAge(in.readInt());
    in.defaultReadObject();//자신의 필드를 역직렬화
    }
}

//alt+Insert
//Serializable부모가 구현을 안했을 경우 자식의 필드만 직렬화 된다.
