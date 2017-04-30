/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.exam25;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

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
    @FXML
    private Slider sliderVolume;
    private boolean endOfMedia;
    @FXML
    private ProgressBar progressBar;
    @FXML
    private Label labelTime;
    @FXML
    private ProgressIndicator progressIndicator;
    @FXML
    private Slider sliderPlay;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Media media = new Media(getClass().getResource("media/video.m4v").toString());//미디어 파일객체를 만들었다.
        // Media media = new Media(getClass().getResource("media/video.mv4").toString());//미디어 파일객체를 만들었다.
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaView.setMediaPlayer(mediaPlayer);//음악파일일경우 보여줄 필요가 없다.미디어 뷰 에 셋팅을 해준다.
        //함수적 인터페이스는 람다식으로 가능하다 바로 시작을 못하고 레디 상태가 먼저 되어야 한다. 눌렀을때 플레이 발생이 일어나야한다.
       //딱한번만 활성화 된다. 미디어가 만들어졌을 때만 즉 처음만 활성화 되는 것이다. 그외에는 활성화 안시켜준다 만들때 활성화 되는 것이다. 
        mediaPlayer.setOnReady(() -> {
            btnPlay.setDisable(false);
            btnPause.setDisable(true);
            btnStop.setDisable(true);
            labelTime.setText("0/"+(int)mediaPlayer.getTotalDuration().toSeconds()+"초");
  
        });
        //플레이 상태일때는 버튼들의 활성화 정의 해준다
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
            progressBar.setProgress(1.0);
            progressIndicator.setProgress(1.0);
        });

        btnPlay.setOnAction(event -> {
            if (endOfMedia) {
                mediaPlayer.stop();
                mediaPlayer.seek(mediaPlayer.getStartTime());
            }
            mediaPlayer.play();
            endOfMedia=false;
        });
        //액션이 발생했을때 함수적 인터페이스라서 가능하다.
        btnPause.setOnAction(event -> {
            mediaPlayer.pause();
        });
        btnStop.setOnAction(event -> {
            mediaPlayer.stop();
        });
            sliderPlay.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                
                if(sliderPlay.isValueChanging()){//연주중에 사용자가 마우스로 값을 바꾸려고 할때 true 가 된다.
                   mediaPlayer.seek(Duration.seconds(mediaPlayer.getTotalDuration().toSeconds()/100*newValue.doubleValue()));//미디어 플레이 찾아라 Duration 의 초를 
               }else{
            	   if(Math.abs(oldValue.doubleValue()-newValue.doubleValue())>0.5){//value 의 차가 0.5 이상일때 마우스 찍은곳으로 이동해라
            		   mediaPlayer.seek(Duration.seconds(mediaPlayer.getTotalDuration().toSeconds()/100*newValue.doubleValue()));//seek 찾는 곳이다.
            	   }
               }
              
            }
        });
      
        sliderVolume.valueProperty().addListener(new ChangeListener<Number>(){
             @Override
             public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {//newValue 로 들어온다.
                mediaPlayer.setVolume(newValue.doubleValue()/100.0);
             }
        });
        sliderVolume.setValue(50);
        mediaPlayer.currentTimeProperty().addListener(new ChangeListener<Duration>(){//미디어 플레이 실시간 감시 Duration 
             @Override
             public void changed(ObservableValue<? extends Duration> observable, Duration oldValue, Duration newValue) {
                 double progress=newValue.toSeconds()/mediaPlayer.getTotalDuration().toSeconds();//0~1 전체분에 이동하는 시간 1까지 
              
                 sliderPlay.setValue(progress*100);
                
                 progressBar.setProgress(progress);
                 progressIndicator.setProgress(progress);
                 labelTime.setText(
                 (int)newValue.toSeconds()+"/"+(int)mediaPlayer.getTotalDuration().toSeconds()+"초"
                 );
             }
            
        });
        
    }

}
