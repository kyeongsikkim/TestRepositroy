package ch17.exam14;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class RootController implements Initializable {
    @FXML private Label label;
    @FXML private Slider slider;
    


    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
       double value = slider.getValue();
        slider.setValue(50);
        slider.valueProperty().addListener(new ChangeListener<Number>(){
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println(newValue);
            }
        
        });
    }
}
