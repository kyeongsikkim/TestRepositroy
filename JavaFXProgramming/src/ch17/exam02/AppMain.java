/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch17.exam02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


/**
 *
 * @author Administrator
 */
public class AppMain extends Application {
    //vbox 역할은 라벨하고 버튼을 감싸고 있는 것이다. parent 로써 vbox 가 온것이다.
    @Override
    public void start(Stage stage) throws Exception {
        VBox vbox=new VBox();
        vbox.setPrefWidth(500);
        vbox.setPrefHeight(300);
        Label label=new Label();
        label.setFont(new Font(50));
        Button button=new Button();
        button.setText("확인");
        vbox.getChildren().add(button);
        label.setText("Hello,JavaFX");
        vbox.getChildren().add(label);
        Scene scene=new Scene(vbox);//컨테이너 객체가 와야한다.
        stage.setScene(scene);
        stage.show();
    }

    
    public static void main(String[] args) {
  
        launch(args);//런치되면은 생성자가 알아서 생성이 된다.
        //Platform.exit();
       
       }

}
