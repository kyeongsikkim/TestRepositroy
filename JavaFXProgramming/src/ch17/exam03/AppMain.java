/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch17.exam03;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Administrator
 */
public class AppMain extends Application {//프로그램적 레이아웃  

    @Override
    public void start(Stage primaryStage) throws Exception {//윈도우창 stage 
        HBox hbox=new HBox();//신은 내부의 컨테이너 객체를 넣어준다. 
        hbox.setPadding(new Insets(10));//여백이다
        hbox.setSpacing(10);//컨트롤간의 사이 
        TextField textField=new TextField();
        Button button=new Button();//버튼 
        button.setText("확인");
        textField.setPrefWidth(200);
        ObservableList list=hbox.getChildren();//자식객체들을 얻어서 추가를 해준다. scene 에 추가가 된다.
        //hbox 의 자식객체 
        list.add(textField);//텍스트 파일 추가
        list.add(button);
        Scene scene=new Scene(hbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
