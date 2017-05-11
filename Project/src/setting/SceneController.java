/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setting;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import static setting.RootController.sta;

/**
 * FXML Controller class
 *
 * @author KIM
 */
public class SceneController implements Initializable {

	@FXML
	private ToggleGroup select;
	@FXML
	private Slider sliderLight;
	@FXML
	private Button btnSaveModeDown;
	@FXML
	private TextField txtSaveMode;
	@FXML
	private Button btnSaveModeUp;
	@FXML
	private RadioButton btnBackground1;
	@FXML
	private RadioButton btnBackground2;
	@FXML
	private RadioButton btnBackground3;
	@FXML
	private Button btnAccept;
	
	double sliderLightValue;
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
		if (sta.getTxtSaveMode() != null) {
				txtSaveMode.setText(sta.getTxtSaveMode());
		} 
		btnSaveModeUp.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String[] str=txtSaveMode.getText().split("분");
				int min = Integer.parseInt(str[0]);
				if (min == 10 || min == 7) {
					if (min == 10) {
						txtSaveMode.setText(min + 5 + "분");
					} else {
						txtSaveMode.setText(min + 3 + "분");
					}
				} else if (min >= 15) {
					txtSaveMode.setText(15 + "분");
				} else if (min >= 1) {
					txtSaveMode.setText(min + 2 + "분");
				}
			}
		});
		btnSaveModeDown.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String[] str=txtSaveMode.getText().split("분");
				int min = Integer.parseInt(str[0]);
				if (min == 15 || min == 10) {
					if (min == 15) {
						txtSaveMode.setText(min - 5 + "분");
					} else {
						txtSaveMode.setText(min - 3 + "분");
					}
				} else if (min >= 3) {
					txtSaveMode.setText(min - 2 + "분");
				} else if (min <= 1) {
					txtSaveMode.setText(1 + "분");
				}
			}
		});

		btnAccept.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
				sta.setTxtSaveMode(txtSaveMode.getText());
				if(sliderLightValue==0){
				sliderLightValue=sta.getSliderLight();
				sta.setSliderLight(sliderLightValue);
				}else{
				sta.setSliderLight(sliderLightValue);
				}
			}
		});
		sliderLight.setValue(sta.getSliderLight());
		sliderLight.valueProperty().addListener(new ChangeListener<Number>(){
					@Override
					public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
						sliderLightValue=newValue.doubleValue();
					
					}
		
		});
	}
}
