/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.exam17;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class RootController implements Initializable{
   @FXML private Circle circle;
   @FXML private AnchorPane root;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
       circle.centerXProperty().bind(Bindings.divide(root.widthProperty(),2));//이거의 반만큼 바인딩 하겠다.
       
       circle.centerYProperty().bind(Bindings.divide(root.heightProperty(),2));
       
    }

   
}
//속성 감시자 