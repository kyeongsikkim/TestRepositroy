/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.exam30;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class RootController implements Initializable {

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Button btnChangeCSS;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       //anchorPane.getStylesheets().add(AppMain.class.getResource("root.css").toString());
   btnChangeCSS.setOnAction(e->{//액션 있을 때 이벤트 핸들러로 처리를 하는 것이다.
       anchorPane.getStylesheets().clear();
       anchorPane.getStylesheets().add(AppMain.class.getResource("root2.css").toString());//테마 변경 
   });
    }    
    
}
