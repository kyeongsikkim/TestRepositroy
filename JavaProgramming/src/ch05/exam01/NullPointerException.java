package ch05.exam01;

public class NullPointerException {

	public static void main(String[] args) {
		int[]scores=null;//배열은 생성이 안됐다. 변수만 생성이 되었다.

		//System.out.println(scores[0]);
		//System.out.println(scores);//번지수가 나오는 것이다.스택에 있는 변수의 값을 출력하는 것이다. 
		String name=null;//객체는 생성이 안된 상태에서 변수만 만들어지는 것이다.null 을 넣었을 경우 
		
		System.out.println(name.length());//변수가 참조하고있는 객체로 가서 길이를 측정해라 그런데 지금 가르키는 객체가 없으므로 nullexception 이 나온다. 출력할때는 함수를 호출한다.
		//name.length(); name 이 참조하는 객체를 가서 length() 라는 함수를 호출해라  
		// . 은 객체 접근 연산자라고 한다. String v1=(객체를 생성한 번지수를 v1 에 넣어준다.)null 이 올경우 객체는 생성을 안한다.
		//char 타입은 정수 타입 이다. '," 은 다른 표현이다. ""문자열 타입으로 생각한다.
		//String v2="가"
	}

}
