package ch07.exam03;

public class Parent {
//Field
String lastName;//이렇게 하면 객체가 생성이 될때 마다 모두 김씨가 된다.

//constructor
Parent(String lastName){
	this.lastName=lastName;
}
//Method
void sound(){
	System.out.println("허허");
}
}
