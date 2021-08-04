package testing; // method 3

import FinalDemo.MaJiMac;

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
		
		public static void main(String[] args) {
			Calculator cal = new Calculator();
			
			cal.setOprands(10,20, 30);
			int i = 0;
			int g = 0;
			i = cal.plus();
			g = cal.aveg();
			System.out.println(i);
			System.out.println("dddd");
			System.out.println(g);
		}
		
			
		
		

		/*public int sum(int[] nums ) {
			int i = 0;
			for (int a = 0; a < nums.length; a++) {
				
				i = i + nums[a];
				
			}	
			System.out.println(i);
			return i;
		}
		
		public int avg(int[] nums ) {
			int i = this.sum(nums) / nums.length;
			System.out.println(i);
			return i; 
		}*/
}