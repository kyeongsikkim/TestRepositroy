package ch10.exam03;

public class CatchByExceptionKindExample {
	public static void main(String []args){
		try{
		String str=null;
		System.out.println(str.length());//nullpoint Exception ���⼭ ������ �߻��ϰ� �Ǹ��� exception�� ���� �������� ã�Ƴ��� �� �ּҰ��� ���� ������ ���� �־��ش�.
		
		int []scores={90,85};
		for(int i=0;i<3;i++){//Array
			System.out.println(scores[i]);
		}
			String strNum="a";
			int num=Integer.parseInt(strNum);//number format Exception

	}catch(NullPointerException  |ArrayIndexOutOfBoundsException erroMessage){//e ��� �������� �ϳ��� ���� �ȴ�.
		//�ڵ�1 �Ȱ��� ������� ���� ó�� �ϰڴ�/.
		System.out.println("����ó���ڵ� 1");
	}
		/*catch(ArrayIndexOutOfBoundsException e){
		//�ڵ� 1
   }*/
		catch(NumberFormatException e){
		//�ڵ� 2 �̰͸� �ٸ� ������� ���� ó�� �ϰڴ�.
		System.out.println("����ó�� �ڵ� 2");
	}
	}
}

