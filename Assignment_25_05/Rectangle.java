package Assignment_25_05;

public class Rectangle extends Shape{
	
	 
		public void showRectangle() {
		
			System.out.println("This is rectangle ");
			
		}
		
		
		public static void main(String[] args) {
			
			Rectangle R = new Rectangle();
			R.show();
			R.showRectangle();
		}

}
