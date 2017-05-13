/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.exam40;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class RootController implements Initializable {

	@FXML
	private Button btnLogin;

	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		btnLogin.setOnAction(e->handleBtnLogin(e));
	}	

	private void handleBtnLogin(ActionEvent e) {
		try {
			Parent parent=FXMLLoader.load(getClass().getResource("login.fxml"));
			Scene scene=new Scene(parent);
			Stage primaryStage=(Stage)btnLogin.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (IOException ex) {
		}
	}
	
}
