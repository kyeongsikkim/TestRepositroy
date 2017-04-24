package ch09.exam08;

public class Button {//다양한 결과가 나오기 위해서 다형성 
	//field
	private OnClickListener onClickListener;//필드 설정 안해주면 null 이된다.
	
	//constructor
	//mehtod
	public void setOnClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}
	public void touch(){
		if(onClickListener!=null){
			onClickListener.onClick();
		}
	}
	//Nested Interface
	interface OnClickListener{//객체는 우리가 줘야 한다.
		void onClick();
	}

}
/*필드로 인터페이스 타입이 있다. 인터페이스는 button 안에 선언 되어있다. 인터페이스는 버튼을 떠나서는 의미가 없다.
밀접한 관계가 있다. 인터페잇르르 필드로 선언을 했다.객체 사용방법 통일시키는것 인터페이스로 사용가능한 객체 는 없다. 위 코드에는 
객체는 어디서 들어올까? 세터에서 객체가 대입되게 된다. 외부에서 객체가 들어오면은 onClickListener 에 대입이 되게 된다. 
		13라인에서 인터페이스 가 실행이 되게 된다. onClicListener.onClik() 실행이 된다. 누구의 onClick 이 실행이 되냐면 우리가 넣어준 객체가 실행이된다.
		객체가 대입이 되고 필드의 값으로 들어가게 되면은 터치 했을 때 실행을 하게 된다. 그때 onClicListener.onClik 의 인터페이스가 실행 이 된다.*/