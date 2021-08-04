package calculator;

public class CalculatorPlus extends Calculator2 {
	
		public void sum() {
			System.out.println(super.left + super.right);
		}
		public void avg() { 
			System.out.println((super.left + super.right) / 2);
		
	}
}
