/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.exam37;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class RootController implements Initializable {

    @FXML
    private Label lblTime;
    @FXML
    private Button btnStart;
    @FXML
    private Button btnStop;
    
    private boolean stop;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnStart.setOnAction(e->handleBtnStart(e));
        btnStop.setOnAction(e->handleBtnStop(e));
    }    

    private void handleBtnStart(ActionEvent e) {
      stop=false;
      Thread thread=new Thread(){//이 쓰레드에서 UI 를 변경하고 있다. 그래서 에러가 난다.
          @Override
          public void run() {
           SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
           while(!stop){
               String strTime=sdf.format(new Date());
               Platform.runLater(()->{
               lblTime.setText(strTime);
               });
               
               try{
               Thread.sleep(100);
               }catch(Exception e){
                }
           }
          }
      
      };
      thread.setDaemon(true);
      thread.start();
      
    }

    private void handleBtnStop(ActionEvent e) {
        stop=true;
    }
    
}
