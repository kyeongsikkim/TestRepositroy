package ch06.exam12;

public class BoardExample {

	public static void main(String[] args) {
		Board board=new Board();
		board.setBno(-1);
		board.setTitle("이제 봄입니다.");
		board.setContent("놀러가야 겠네");
		board.setWriter("홍자바");
		//set 과 get을 이용하는 이유는 잘못된 값을 집어넣었을 때 올바른 값을 
		//필드를 직접 노출시켜서 외부에서 접근 
		System.out.println(board.getBno());
		System.out.println(board.getTitle());
		System.out.println(board.getContent());
	}

}
