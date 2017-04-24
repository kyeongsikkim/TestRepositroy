package ch06.exam12;

public class Board {
	private int bno;
	private String title;
	private String content;
	private String writer;//직접적으로 접근을 하지 못하게
	//public Board(){};//생성자는 객체를 생성해서 사용하기 위한 것이다. static 는 객체를 생성을 안하고 사용하기 위한 것이다.
	//data private 를 많이 사용한다. 캡슐화라고 한다. 외부에 드러난 메소드와 필드만 사용을 할 수 있고 접근 제어자로 보호한다. 이러한 보호를 하는 이유는 
	//외부 클래스는 내부의 구조를 알 수 없다. 캡슐화를 하는 이유는 외부의 잘못된 접근으로 인해서 클래스가 망가질수있다
	//함수로 접근하는것은  data 를 보호하기 위해서 private 즉 잘못된 값이 들어왔을 때 함수를 사용하면은 검사를 할 수 있지만 직접적으로 데이터에 접근을
	//하게 되면은 검사없이 바로 데이터에 대입이 되기때문에 잘못된 값이 들어와도 검사를 할수없다.
	private boolean open;
	public void setBno(int bno) {
		this.bno = bno;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setOpen(boolean open){
		this.open=open;
	}
	public int getBno() {//함수를 통해서 접근하는 이유 캡슐화와 관련있다. 
		return bno;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public String getWriter() {
		return writer;
	}
	public boolean isOpen(){
		return open;//boolean 만 게터 세터를 안쓰고 게터는is 를 사용한다.세터는 똑같다.
	}
	
	}

	

