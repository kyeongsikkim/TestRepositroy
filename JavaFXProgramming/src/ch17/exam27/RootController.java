/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.exam27;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class RootController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void menuItemNew(ActionEvent event) {
        System.out.println("시작이 출력되었습니다");
    }

    @FXML
    private void JavaPlicaton(ActionEvent event) {
        System.out.println("하하");
    }
    
}
