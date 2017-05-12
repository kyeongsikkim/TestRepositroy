/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.homework.exam32;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *이벤트 처리하는 방법과 속성을 감시하는 방법이 있다 이벤트 처리는 사용자가 처리하는것 버튼을 눌러서 발생시키는것이다. 그러나 속성감시는 상대방이 변한 것을 확인해서 나도 스스로 변하는것을 뜻한다.
 * 
 * @author Administrator
 */
public class AppMain extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent parent=FXMLLoader.load(AppMain.class.getResource("root.fxml")); //fxml불러옴 
        //Parent parent=FXMLLoader.load(getClass().getResource("root.fxml"));
        
        Scene scene=new Scene(parent); //HBox를 받는거랑 같음(Parent 상속받으니까)/Hbox로 바꿔도됨
        primaryStage.setScene(scene);
        primaryStage.setTitle("로그인");
        
        primaryStage.setOnCloseRequest(event ->{
            System.out.println("Close");
        });
        
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
