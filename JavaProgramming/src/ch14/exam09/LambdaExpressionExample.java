package ch14.exam09;

import java.util.function.IntBinaryOperator;

public class LambdaExpressionExample {
	private static int []scores={92,95,87};
	public static void main(String[] args) {
		
		
		int max=maxOrMin((a,b)->{
			if(a>=b) return a;
			else return b;
		});
		int min=maxOrMin((a,b)->{
			if(a<=b) return a;
			else return b;
		});
		System.out.println(max+" "+min);
	}
	public static int maxOrMin(IntBinaryOperator operator){//두개의 int 를 받아서 비교하여 비교한다 함수적 인터페이스
		int result=scores[0];
		for(int score:scores){
			result=operator.applyAsInt(result, score);//추상메소드를 재정의 해야 한다.
		}
		return result;
	}
}
