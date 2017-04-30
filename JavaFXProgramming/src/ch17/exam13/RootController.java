package ch17.exam13;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class RootController implements Initializable {

    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println(btn1.getText());
        btn1.setOnAction(new javafx.event.EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {//함수적 인터페이스 
                System.out.println("버트 1이 출력됨");
            }
        });
        btn2.setOnAction(event -> {
            System.out.println("버튼 2가 출력됨");
        });
        
        btn4.setOnAction(new javafx.event.EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {//함수적 인터페이스 
                System.out.println("버트 4이 출력됨");
            }
        });
     
        
        btn5.setOnAction(event->{
            System.out.println("버튼 5가 출력됨");
        });
    }

    public void btn3Handle(ActionEvent event) {
        System.out.println("버튼 3이 출력됨");
    }
    public void btn6Handle(ActionEvent event){
        System.out.println("버튼 6이 출력됨");
    }
}
