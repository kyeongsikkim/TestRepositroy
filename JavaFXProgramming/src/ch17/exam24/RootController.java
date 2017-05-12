/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.exam24;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class RootController implements Initializable {

    @FXML
    private MediaView mediaView;
    @FXML
    private Button btnPlay;
    @FXML
    private Button btnPause;
    @FXML
    private Button btnStop;

    private boolean endOfMedia;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Media media = new Media(getClass().getResource("media/video.m4v").toString());//미디어 파일객체를 만들었다.
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaView.setMediaPlayer(mediaPlayer);//음악파일일경우 보여줄 필요가 없다.
        //함수적 인터페이스는 람다식으로 가능하다 바로 시작을 못하고 레디 상태가 먼저 되어야 한다. 눌렀을때 플레이 발생이 일어나야한다.
       //딱한번만 활성화 된다. 미디어가 만들어졌을 때만 즉 처음만 활성화 되는 것이다. 그외에는 활성화 안시켜준다 만들때 활성화 되는 것이다. 
        mediaPlayer.setOnReady(() -> {
            btnPlay.setDisable(false);
            btnPause.setDisable(true);
            btnStop.setDisable(true);

        });
        mediaPlayer.setOnPlaying(() -> {
            btnPlay.setDisable(true);
            btnPause.setDisable(false);
            btnStop.setDisable(false);
        });

        mediaPlayer.setOnPaused(() -> {
            btnPlay.setDisable(false);
            btnPause.setDisable(true);
            btnStop.setDisable(false);
        });
        //강제로 정지시키는 것이고 가장 앞으로 가서 알아서 재생하게 된다.
        mediaPlayer.setOnStopped(() -> {
            btnPlay.setDisable(false);
            btnPause.setDisable(true);
            btnStop.setDisable(true);
        });
        //재생이 끝나서 종료가 되는 것이다.
        mediaPlayer.setOnEndOfMedia(() -> {
            endOfMedia = true;
            btnPlay.setDisable(false);
            btnPause.setDisable(true);
            btnStop.setDisable(true);
        });

        btnPlay.setOnAction(event -> {
            if (endOfMedia) {
                mediaPlayer.stop();
                mediaPlayer.seek(mediaPlayer.getStartTime());
            }
            mediaPlayer.play();
            endOfMedia=false;
        });
        btnPause.setOnAction(event -> {
            mediaPlayer.pause();
        });
        btnStop.setOnAction(event -> {
            mediaPlayer.stop();
        });
    }

}
