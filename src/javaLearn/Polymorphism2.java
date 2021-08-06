/*package javaLearn;
interface I{}

interface I2{
	public String A();
}
interface I3{
	public String B();
}
class C implements I{}
class D implements I2, I3 {
	public String A(){
		return "a";
	}
	public String B() {
		return"b";
	}
}
public class Polymorphism2 {

	public static void main(String[] args) {
		I obj = new C();
		D obj2 = new D();
		I2 objI2 = new D();
		I3 objI3 = new D();
		
		obj2.A();
		obj2.B();
		
		objI2.A();
		objI3.B();
	}

}
*/