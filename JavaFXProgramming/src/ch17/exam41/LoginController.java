/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.exam41;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class LoginController implements Initializable {

	@FXML
	private BorderPane login;
	@FXML
	private Button btnMain;


	@Override
	public void initialize(URL url, ResourceBundle rb) {
		btnMain.setOnAction(e->handleBtnMain(e));
	}	

	private void handleBtnMain(ActionEvent e) {//로그인 컨트롤러 에서 Scene 로 갔다가 roo.fxml 로 가야한다.getRoot(),getScene();스태틱 선언도 가능
	//RootController.rootPane.getChildren().remove(1);
			//리스트에서는 리무브를 통해서 제거한다.
		StackPane rootPane=(StackPane)btnMain.getScene().getRoot();
			rootPane.getChildren().remove(login);
			
}
}
