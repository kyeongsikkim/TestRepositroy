package ch11.exam05;
//java .lang �� import ���� ����� �����ϴ�.
public class SystemExample {

	public static void main(String []args){
		System.setSecurityManager(new SecurityManager(){
			@Override
			public void checkExit(int status) {//���ܸ� �߻���Ų��.
				//System.out.println("checkExit");
				if(status!=54321){
					throw new SecurityException();//���ܸ� �߻���Ű�� �ڵ�  ���࿹�� �̱� ������ try catch �Ⱥٿ��� �ȴ�. ������ ������ �ƴϴ�.
				}
			}
		});//Ű���带 �뺸��securityManger ��ü�� ���� ������� ���̴�
		
		
		for(int i=0;i<10;i++){//������ �ݺ��ؾ� �ȴ�.i �� 5�Ǵ� ������ �ؿ� �ڵ尡 ����Ǿ� jvm ���ᰡ �߻��Ѵ�.
			System.out.println(i);
			if(i==5){
				//���� ������ ���� ����� ������ �� �ְ� ���� �ʿ䵵 �ִ�.
				try{
				System.exit(0);//�׷��� ��ȣ�� �޴´� ���� ���ϴ� ���ڸ� �Է����� �� ���� �� �� �ְ� �θ� ��� checkExit �� ������ �ȴ�.
				}catch(SecurityException e){}
				//�ƹ��͵� �ȳִ� ���� ���ø� �ϰڴ�. �׳� �׸��� �ٽý����ϰڴ�.
				}
		}
	}
}
