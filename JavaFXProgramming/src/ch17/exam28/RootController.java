/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.exam28;

import java.io.File;
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
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class RootController implements Initializable {

    private Stage primaryStage;

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void handleOpenFileChooser(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(primaryStage);//프라이머리 스테이지 어떻게 얻을까?
        System.out.println(file.getPath());
        //AppMain.Stage
    }

    @FXML
    private void handleSaveFileChooser(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();

        Button button = (Button) event.getSource();
        Scene scene = button.getScene();
        Stage stage = (Stage) scene.getWindow();
        //(Button)event.getSource().getScene().getScene()
        File file = fileChooser.showSaveDialog(stage);//프라이머리 스테이지 어떻게 얻을까?
    }

    @FXML
    private void handleDirectroyChooser(ActionEvent event) {
        DirectoryChooser directoryChooser = new DirectoryChooser();
        File file = directoryChooser.showDialog(AppMain.primaryStage);//프라이머리 스테이지 어떻게 얻을까?
    }

    @FXML
    private void handlePopup(ActionEvent event) throws Exception {
        showNotification("알림", "메시지가 도착했습니다");
        showNotification("경고", "메시지가 도착했습니다");
    }

    private void showNotification(String type, String message) throws Exception {
        Popup popup = new Popup();
        HBox hbox = (HBox) FXMLLoader.load(getClass().getResource("popup.fxml"));
        ImageView imgMessage = (ImageView) hbox.lookup("#imgMessage");
        Label lblMessage = (Label) hbox.lookup("#lblMessage");
        if (type.equals("알림")) {
            imgMessage.setImage(new Image(getClass().getResource("images/dialog-info.png").toString()));
        } else if (type.equals("경고")) {
            imgMessage.setImage(new Image(getClass().getResource("images/dialog-warning.png").toString()));
        }
        lblMessage.setText(message);
        popup.getContent().add(hbox);
        popup.setAutoHide(true);//주윈도우창을 닫거나 
        popup.show(primaryStage);
    }

    @FXML
    private void handleCustom(ActionEvent event) throws IOException {
        showCustomDialog("help", "확인하셨습니까?");

    }

    private void showCustomDialog(String type, String message) throws IOException {

        Stage dialog = new Stage(StageStyle.UNIFIED);
        Parent parent = FXMLLoader.load(getClass().getResource("custom-dialog.fxml"));

        ImageView icon = (ImageView) parent.lookup("#icon");
        Label lblmessage = (Label) parent.lookup("#message");
        Button btnOk = (Button) parent.lookup("#btnOk");
        if (type.equals("error")) {
            icon.setImage(new Image(getClass().getResource("images/dialog-error.png").toString()));
        } else if (type.equals("help")) {
            icon.setImage(new Image(getClass().getResource("images/dialog-help.png").toString()));
        } else if (type.equals("info")) {
            icon.setImage(new Image(getClass().getResource("images/dialog-info.png").toString()));
        } else if (type.equals("warning")) {
            icon.setImage(new Image(getClass().getResource("images/dialog-warning.png").toString()));
        }
        lblmessage.setText(message);
        btnOk.setOnAction(e -> {
            dialog.hide();
        });
        Scene scene = new Scene(parent);
        scene.setFill(Color.TRANSPARENT);
        dialog.setScene(scene);
        dialog.initModality(Modality.WINDOW_MODAL);
        dialog.initOwner(primaryStage);//이거하나가 추가되어야 한다. 주윈도우가 존재해야 된다. 소유자 윈도우가 필수이다.
        dialog.show();
    }

}
