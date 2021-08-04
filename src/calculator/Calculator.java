package calculator; // method 3

public class Calculator implements Calculatable{

	    static final double PI = 3.14;
		int left, right, third;
		public void setOprands(int first, int second, int third) {
			this.left = left;
			this.right = right;
			this.third = third;
		}
		public int plus() {
			return this.left + this.right + this.third;
		}
		public int aveg() {
			return (this.left + this.right + this.third )/ 2;
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