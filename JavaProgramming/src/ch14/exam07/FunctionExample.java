package ch14.exam07;

import java.util.function.DoubleToIntFunction;
import java.util.function.Function;

import ch14.exam06.Member;

public class FunctionExample {

	public static void main(String[] args) {

		method1((a)->{
			return (int)(a);});
	}
	/*	method1((a)->{
		return (int)(Math.round(a);});*///�ݿø��� �ؼ� int ������ ��ȯ ���Ѷ� 
	
/*	method2((m)->{
		return m.getMname();//�̸��� �̾Ƴ��°�
	});*/
	//������ �̾Ƴ��°� 
	/*method2(new Function<Member,String>(){
		public String apply(Member t) {
			
		};
	});*/
	public static void method1(DoubleToIntFunction arg){
		int result=arg.applyAsInt(3.54);//����� �ֳĿ� ���� ���� �ٸ���. ���� ��ü�� ����� �Ѵ�.������ �ָ� ��Ʈ�� ���´� �޼ҵ� ȣ���Ҷ��������ش�.
	}
	public static void method2(Function<Member,String>arg){//Member �� �޾Ƽ� R�� ���� ��ü�� ���� ���� Ÿ���� �˷���� �Ѵ�.
		Member member=new Member("white","ȫ�浿");
		String result=arg.apply(member);//����ָ� �׳� ��Ʈ���� ���´�.
		System.err.println(result);
	}
}