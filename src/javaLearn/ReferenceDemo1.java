package javaLearn;
class A{
	public int id;
	A(int id){
		this.id = id;
	}
}

public class ReferenceDemo1 {

	public static void main(String[] args) {
		runValue();
		runReference();
		runReference2();

	}
	
	public static void runValue() {
		int a = 1;
		int b = a;
		b = 2;
		System.out.println("runValue, " +a);;
	}
	public static void runReference() {
		A a = new A(1);
		A b = a;
		b.id = 2;
		System.out.println("runReference, "+a.id);
	}
	static void _reference2(A b) {
		b.id = 2;
	}
	static void runReference2() {
		A a = new A(1);
		_reference2(a);
		System.out.println("runReference2, "+a.id);
	}

}
