/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.exam19;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class RootController implements Initializable {

    @FXML
    private TextField txtTitle;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private ComboBox<String> comboPublic;
    @FXML
    private DatePicker dateExit;
    @FXML
    private TextArea txtContent;
    @FXML
    private Button btnReg;
    @FXML
    private Button btnCancel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       ObservableList<String> value=FXCollections.observableArrayList();
       value.add("공개");
       value.add("비공개");
        comboPublic.setItems(value);
        
    }   
    public void btnRegHandle(ActionEvent event){
            String title=txtTitle.getText();
            String passwrod=txtPassword.getText();
            String strPublic=comboPublic.getValue();
            LocalDate localData=dateExit.getValue();
            String content=txtContent.getText();
       
        System.out.println("title:"+title);
        System.out.println("txtPassword:"+passwrod);
        System.out.println("comboPublic:"+strPublic);
        System.out.println("dateExit:"+localData.toString());
        System.out.println("txtContent:"+content);

    }
    
    
}
