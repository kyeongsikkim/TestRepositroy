package homework.ch14.exam5;

public class UsingThisExample {

	public static void main(String[] args) {
		UsingThis usingThis=new UsingThis();
		UsingThis.Inner inner=usingThis.new Inner();
		inner.method();
	}

}
