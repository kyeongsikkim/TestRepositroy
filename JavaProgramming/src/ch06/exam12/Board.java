package ch06.exam12;

public class Board {
	private int bno;
	private String title;
	private String content;
	private String writer;//���������� ������ ���� ���ϰ�
	//public Board(){};//�����ڴ� ��ü�� �����ؼ� ����ϱ� ���� ���̴�. static �� ��ü�� ������ ���ϰ� ����ϱ� ���� ���̴�.
	//data private �� ���� ����Ѵ�. ĸ��ȭ��� �Ѵ�. �ܺο� �巯�� �޼ҵ�� �ʵ常 ����� �� �� �ְ� ���� �����ڷ� ��ȣ�Ѵ�. �̷��� ��ȣ�� �ϴ� ������ 
	//�ܺ� Ŭ������ ������ ������ �� �� ����. ĸ��ȭ�� �ϴ� ������ �ܺ��� �߸��� �������� ���ؼ� Ŭ������ ���������ִ�
	//�Լ��� �����ϴ°���  data �� ��ȣ�ϱ� ���ؼ� private �� �߸��� ���� ������ �� �Լ��� ����ϸ��� �˻縦 �� �� ������ ���������� �����Ϳ� ������
	//�ϰ� �Ǹ��� �˻���� �ٷ� �����Ϳ� ������ �Ǳ⶧���� �߸��� ���� ���͵� �˻縦 �Ҽ�����.
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
	public int getBno() {//�Լ��� ���ؼ� �����ϴ� ���� ĸ��ȭ�� �����ִ�. 
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
		return open;//boolean �� ���� ���͸� �Ⱦ��� ���ʹ�is �� ����Ѵ�.���ʹ� �Ȱ���.
	}
	
	}

	

