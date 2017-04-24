package ch12.exam09;

public class ReadThread extends Thread{
private DataBox dataBox;

public ReadThread(DataBox dataBox){//객체를 받아서 생성한 것이다.
	this.dataBox=dataBox;//생성자 주입
}

public void setDataBox(DataBox dataBox) {//세터 주입 
	this.dataBox = dataBox;//셋터로도 값 대입이 가능하다.
}
@Override//쓰레드를 실행시키려면 run 메소드를 재정의 해야 한다.
	public void run() {
	for(int i=0;i<10;i++){
		dataBox.getData();

	}
	}

}
