package ch14.exam07;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {

	public static void main(String[] args) {
		method1(new Consumer<String>(){//new 
			@Override
			public void accept(String t) {
				System.out.println(t);

			}
		});
		method1((s)->{//�Ű������ϳ��� �޴´�.
			System.out.println("����:"+s);
		});
		method2((a,b)->{
			System.out.println(a+"-"+b);
		});
		/*method2(new BiConsumer<String,String>(){
			@Override
			public void accept(String t, String u) {				
			}
		});*/
		method3((o,i)->{
			for(int k=0;k<i;k++){
				System.out.println(o);
			}
		});
	}

	public static void method1(Consumer<String>arg){//�Ű������� �ϳ��޴´�. String ���������� Consumer �� ��ü�� ���� ���� �� �ִ�.
		arg.accept("Java");//��� �Һ��Ѵٴ� ���� ����. ������ü�� �������� �� �� �ִ�.
	}
	public static void method2(BiConsumer<String,String>arg){//�Լ��� �������̽� �߻� �޼ҵ尡 �ϳ��� �ִ�.
		arg.accept("Iot", "Java");
	}
	public static void method3(ObjIntConsumer<String>arg){//������Ʈ Ÿ�Ը� �����ְ� obj �� Ÿ���� ���� �˷���� �Ѵ�. int Ÿ���̶�� �˷���� ������ obj �� �˷��ָ� �ȴ�.
		arg.accept("ȫ�浿", 2);
	}
}
