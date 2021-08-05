package javaLearn;

class Excep{
	private int [] arr = new int [3];
	Excep() {
		arr[0]=0;
		arr[1]=10;
		arr[2]=20;
	}
	public void dividing(int first, int second) {
		try {
			System.out.println(first / second);
		} catch(Exception e) {
			System.out.println("error");
			//e.printStackTrace();
		} 
		
		/*catch (ArithmeticException e) {
			System.out.println("ArithmeticException e");
		} catch (ArrayIndexOutOfBoundException e) {
			System.out.println("arrayindexoutofboundexception");
		}*/
		
		
		
	} 
}

public class ExceptionDemo {

	public static void main(String[] args) {
		Excep a = new Excep();
		a.dividing(2, 1);
	}
}

	


