package ch10.exam06;

public class BalanceInsufficientException extends Exception{//��Ÿ�� �ް� ������ RunException ���� �Ѵ� �����Ϸ��� ���� ó�� �Ұ��̸� Exception ���� �����Ϸ� üũ ���ϸ� RuntimeException ���� �Ѵ�.
//�ϳ��� �����ڸ� ������ְ� 
public BalanceInsufficientException(){
	super();//�ڵ����� ������ �Ǿ��ִ�. Exception �⺻������ �����.
}
public BalanceInsufficientException(String message){
	super(message);
}
}
//�츮�� ���ϴ� Exception �� �ް� �ϳ��� �⺻������ �ϳ��� �޼����� �ް� �ȴ�. 