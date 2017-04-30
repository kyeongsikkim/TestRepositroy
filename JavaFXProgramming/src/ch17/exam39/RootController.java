/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.exam39;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.concurrent.Service;
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
	private Label lblWorkDone;
	@FXML
	private Label lblResult;
	@FXML
	private Button btnStart;
	@FXML
	private Button btnStop;
	
	private TimeService timeService;

	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		btnStart.setOnAction(e->handleBtnStart(e));
		btnStop.setOnAction(e->handleBtnStop(e));
	}	

	private void handleBtnStart(ActionEvent e) {
		if(timeService==null){
			timeService=new TimeService();
			timeService.start();//내부적으로 쓰레드를 가지고 있다.쓰레드 생성없이 바로 사용할 수 있다. 쓰레드 직접사용할때는 생성코드 필요
		}else{
			timeService.restart();
		}
	}

	private void handleBtnStop(ActionEvent e) {
	 timeService.cancel();
	}
	class TimeService extends Service<Integer>{

		@Override
		protected Task<Integer> createTask() {
			Task<Integer> task=new Task<Integer>(){
				@Override
				protected Integer call() throws Exception {//서비스 시작하면 작업쓰레드가 자동으로 작업한다 call이 호출이 된다.
					int sum=0;
					for(int i=0;i<100;i++){
						sum+=i;
						if(isCancelled()){
							break;
							};//위에서 멈추는게 안되는 이유가 별도의쓰레드에서 작업을 계속하기 때문에 cancel 메소드가 호출될때 정지 되게 해야된다.
						try{
						
						Thread.sleep(100);
						}catch(Exception e){
						}
						int value=i;
						Platform.runLater(()->{//익명객체안에 로컬 변수가 사용이 되면 안된다. 로컬 변수는 파이널 특성을 갖는다.
						
						progressBar.setProgress(value/100.0);
						lblWorkDone.setText(String.valueOf(value));
						});
					}
					return sum;
				}
			
			};
			return task;
		}

		@Override
		protected void succeeded() {
		lblResult.setText(String.valueOf(getValue()));
		}
	
	}
}
