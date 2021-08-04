package calculator;

public class CalculatorDemo {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.setOprands(10,20, 30);
		int i = 0;
		int g = 0;
		i = cal.plus();
		g = cal.aveg();
		
		System.out.println("===============");
		System.out.println(i);
		System.out.println(g);
		System.out.println("===============");
		
		int[] a = {100, 200, 300}; 
		int r = 0;
		r = cal.sum(a);
		System.out.println(r);
		
		
		

	}
}  