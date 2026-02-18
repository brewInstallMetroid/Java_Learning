//Notes for packaging and Generics
//


public class Notes5 {
	public static void main (String[] args) {
		// NOTE:: packaging
		//
		// packaging is just a way to logically structure your code
		// A default folder is at the top of your package (usually called Source)
 
		

	}
}


		// NOTE:: Generic Programming
		//

public class MyGenericClass<T> {
	private T content;
	public void setContent(T content) {
		this.content = content;
	}
	public T getContent() {
		return this.content;
	}
}
public class MyBoundedGenericClass<T extends Number, U> {
	private T content;
	private U content2;
	private int wholeNum;
	public void MyBoundedGenericClass( T content, U content2, int wholeNum) {
		this.content = content;
		this.content2 = content2;
		this.wholeNum = 3;
	}
	public T getContent() {
		return this.content;
	}
	public U getcontent2() {
		return this.content2;
	}
	public int getWholeNum() {
		return this.wholeNum;
	}

}
