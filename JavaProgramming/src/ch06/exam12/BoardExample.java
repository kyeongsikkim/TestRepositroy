package ch06.exam12;

public class BoardExample {

	public static void main(String[] args) {
		Board board=new Board();
		board.setBno(-1);
		board.setTitle("���� ���Դϴ�.");
		board.setContent("����� �ڳ�");
		board.setWriter("ȫ�ڹ�");
		//set �� get�� �̿��ϴ� ������ �߸��� ���� ����־��� �� �ùٸ� ���� 
		//�ʵ带 ���� ������Ѽ� �ܺο��� ���� 
		System.out.println(board.getBno());
		System.out.println(board.getTitle());
		System.out.println(board.getContent());
	}

}
