package ch12.exam09;

public class ReadThread extends Thread{
private DataBox dataBox;

public ReadThread(DataBox dataBox){//��ü�� �޾Ƽ� ������ ���̴�.
	this.dataBox=dataBox;//������ ����
}

public void setDataBox(DataBox dataBox) {//���� ���� 
	this.dataBox = dataBox;//���ͷε� �� ������ �����ϴ�.
}
@Override//�����带 �����Ű���� run �޼ҵ带 ������ �ؾ� �Ѵ�.
	public void run() {
	for(int i=0;i<10;i++){
		dataBox.getData();

	}
	}

}
