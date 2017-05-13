/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.exam16;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class RootController implements Initializable{
   @FXML private TextArea TextArea1;
   @FXML private TextArea TextArea2;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //단방향 바인딩
        //TextArea2.textProperty().bind(TextArea1.textProperty());
        
        //양방향 바인딩
        Bindings.bindBidirectional(TextArea1.textProperty(),TextArea2.textProperty());
    }

   
}
