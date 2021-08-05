package javaLearn;
class O{
	public void a(int param) {
		System.out.println("숫자출력");
		System.out.println(param);
	}
	public void a (String param) {
		System.out.println("문자출력");
		System.out.println(param);
	}
}
class A{
	public String x() {return "A.x";}
}
class B extends A{
	public String x() {return "B.x";}
	public String y() {return "y";}
}
class B2 extends A{
	public String x() {return "B2.x";}
}

public class Polymorphism {

	public static void main(String[] args) {
		O o = new O();
		o.a(1);
		o.a("one");
		System.out.println("=========");
		A obj = new B();
		A obj2 = new B2();
		System.out.println(obj.x());
		System.out.println(obj2.x());
		
	}

}
