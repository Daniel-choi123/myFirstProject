 package calculator;
public class Calculator implements Calculatable{

	    static final double PI = 3.14;
		int left, right, third;
		public void setOprands(int first, int second, int third) {
			this.left = first;
			this.right = second;
			this.third = third;
		}
		public void setOprands(int left, int right) {
			this.left = left;
			this.right = right;
		}
		public int plus() {
			return this.left + this.right + this.third;
		}
		public int aveg() {
			return (this.left + this.right + this.third )/ 2;
		}
		public void divide() throws DivideException {
			if(right == 0) {
				throw new DivideException("cannot divide by zero");
			}
			System.out.println("계산결과는");
				System.out.println(this.left/this.right);
				System.out.println("입니다");
		}
		
		
		
		public int sum(int[] nums ) {
			int i = 0;
			for (int a = 0; a < nums.length; a++) {
				
				i = i + nums[a];
				
			}	
			return i;
		}
		
		public int avg(int[] nums ) {
			int i = this.sum(nums) / nums.length;
			
			return i; 
		}
}