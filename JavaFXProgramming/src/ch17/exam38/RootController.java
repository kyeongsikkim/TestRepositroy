/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.exam38;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class RootController implements Initializable {

	@FXML
	private ProgressBar progressBar;
	@FXML
	private Label label;
	@FXML
	private Label lblWorkDone;
	@FXML
	private Button btnStart;
	@FXML
	private Button btnStop;

	private Task<Integer> task;
	
	@FXML
	private Label lblResult;
	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		btnStart.setOnAction(e->handleBtnStart(e));
		btnStop.setOnAction(e->handleBtnStop(e));
	}	

	private void handleBtnStart(ActionEvent e) {
		task=new Task<Integer>(){
			@Override
			protected Integer call() throws Exception {
					int result=0;
				for(int i=0;i<100;i++){//로컬은 불가하다.
					result+=i;
					//updateProgress(i, 100);//값을 어플리케이션 에게 전달을 해서 속성 바인딩으로 해결한다. 
					//updateMessage(String.valueOf(i));//task 메세지 
					//.setProgress 이런 것으로 셋팅을 하지만 이건 update 로 한다.
					double value=i;
					Platform.runLater(()->{
					
						progressBar.setProgress(value/100);//익명객체는 final 특성이 있어서 그렇다.
					lblWorkDone.setText(String.valueOf(value));
					});
					System.out.println(i);
					if(isCancelled()){
						break;
					}
					try{
						Thread.sleep(100);
					}catch(Exception e){
						break;
					}
				}
				return result;
			}

			@Override
			protected void succeeded() {//자바 FX 어플리 케이션에서 처리한다.
				System.out.println("succedded"+Thread.currentThread().getName());
				int result=getValue();
				lblResult.setText(String.valueOf(result));
				
			}

			@Override
			protected void cancelled() {
				lblResult.setText("작업 취소");
			}

			@Override
			protected void failed() {
			
			}
			
			
		};
		//progressBar.progressProperty().bind(task.progressProperty());//속성 바인딩으로 사용한다.
		
		//lblWorkDone.textProperty().bind(task.messageProperty());
		Thread thread=new Thread(task);//자바fx 어플리케이션 쓰레드 
		thread.start();
	}

	private void handleBtnStop(ActionEvent e) {
		task.cancel();
	}
	
}
//taks progress 와 message 속성이 있다.
//label text 속성이 있다.
//progressBar progress 속성이 있다. 그렇기 때문에 task 와 바인딩이 가능하다
