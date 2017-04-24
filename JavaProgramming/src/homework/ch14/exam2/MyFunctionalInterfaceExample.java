package homework.ch14.exam2;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		MyFunctionalInterface fi;/*new MyFunctionalInterface(){
			@Override
			public void method() {
				System.out.println();
			}
		};*/
		fi=new MyFunctionalInterface(){
			@Override
			public void method() {
				String str="mehtod call1";
				System.out.println(str);
			}
		};
		fi.method();
		fi=()->{
			String str="method call1";
			System.out.println(str);
		};
		fi.method();
		fi=()->{System.out.println("method call2");};
		fi.method();
		
		fi=()->System.out.println("method call3");
		fi.method();
		
		
	}

}
