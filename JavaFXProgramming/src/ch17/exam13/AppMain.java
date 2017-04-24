/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch17.exam13;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author Administrator
 */
public class AppMain extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //load 라는 정적메소드를 호출한다. get class  클래스 기준으로 찾아라 
        Parent parent=FXMLLoader.load(AppMain.class.getResource("root.fxml"));//getClass()를 넣어주거나 클래스 이름을 써주는거나 똑같다.
        //강제 형변환을 통해서 바꿀 수 있다. HBox 일경우 (Hbox)를 달아서 FXML 앞에다가 붙여준다.
        //hbox 는 parent 상속받았다.
        Scene scene=new Scene(parent);//FXML 에 정의 된 내용이 들어간다.Hobx 객체가 들어간다.
        primaryStage.setScene(scene);
        primaryStage.setOnCloseRequest(event->{
            System.out.println("close");
        });
        primaryStage.setTitle("창제목");//윈도우 창에다가 제목을 달아준다.
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
   
    }
    
}
//<?xml version="1.0" encoding="UTF-8"?>//xml 선언부 저장할때 어떤 형태로 할것이다 1byte 3byte 
//자바.lang 는 기본으로 import 되어있다.
//<?import java.lang.*?>
//<?import java.util.*?>
//<?import javafx.scene.*?>
//<?import javafx.scene.control.*?>
//<?import javafx.scene.layout.*?>//클래스라서 사용을 할려면 impotr 가 필요하다 HBox 도 클래스이고 TextField 도 필요하다.
//
//<HBox id="AnchorPane"태그의 속성명=속성값 큰따움표붙이던가 작은따움표 붙인다. 아니면 에러가난다. prefHeight="400.0" prefWidth="600.0" xmlns:fx="http://javafx.com/fxml/1">
//    여기 있는 태그들을 자바 객체로 만들어라 HBox load 가 HBox 객체를 리턴한다.
//</HBox>//루트 태그는 하나만 있어야 한다.루트 태그 루트 엘리먼트 HBox 안에 있는 것은 자식 아니면 자식 엘리먼트라고 한다.시작 태그와 끝태그가 있다.반드시~~~

//Scene 빌더 다운로드 받아서 설치된곳으로 경로를 설정해준다.
//패딩은 안쪽 여백hbox 가 기준 마진은 버튼을 기준으으로 바깥쪽과의 거리  
//@는 상대경로를 뜻한다. 상태경로로 image 에 들어가서 이미지를 얻어와라 fx기준으로 해서 상대경로 표시하는 방법
//비율을 하나만 
//Tool->options-Font->profile 
//Edit formating use all languages settings 
//apperance->look and feel
//
//oracle 에서 다운로드 java developer 가서 맨밑에 가서 다운 받는것 archive 