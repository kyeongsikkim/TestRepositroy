package homework.ch14.exam3;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		
		method1(new MyFunctionalInterface(){
			@Override
			public void method(int x) {
				int result=x*5;
				System.out.println(result);
			}
		});
		fi=(x)->{
			int result=x*5;
			System.out.println(result);
		};
		fi.method(2);
		fi=(x)->{System.out.println(x*5);};
		fi.method(2);
		fi=x->System.out.println(x*5);//한줄일 경우 줄여서 할 수 있다.
		fi.method(2);
	}
	
	public static void method1(MyFunctionalInterface i){
		i.method(2);
	}

}
