package ch14.exam07;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
	
		method1(()->{
			return "ȫ�浿";
					
		});
		method2(()->{
			return 5;
		});
		
	}
	public static void method1(Supplier<String>arg){
		String result=arg.get();//get �� ������ �ؾ� �ȴ�.
	}
	public static void method2(IntSupplier arg){//IntSupplier ��� Ÿ���̴�.  ���� Ÿ���� �˷��ִ� ���̴�.
		int result=arg.getAsInt();//get �� ������ �ؾ� �ȴ�.
	}
}
