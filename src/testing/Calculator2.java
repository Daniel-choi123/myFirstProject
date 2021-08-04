package testing; // method 3

abstract class Calculator2 {

		int left, right;
		public void setOprands (int left, int right) {
			this.left = left;
			this.right = right;
		}
		
		
		public abstract void sum();
		public abstract void avg();
		public void run() {
			sum();
			avg();
		}
		
		
	

}



		
		
		
		





	
	





