package Assignment_21_05;



public class Car {
	
	String brand,model,price;
	
	public void startCar() {
		
		System.out.println("Car started");
		
	}
	public void stopCar() {
		
		System.out.println("Car stopped");
		
	}

	public static void main(String[] args) {
		
		Car c = new Car();
		c.brand = "BMW";
		c.model = "A1";
		c.price = "1C";
		
		System.out.println("Brand is "+c.brand);
		System.out.println("Model is "+c.model);
		System.out.println("Price is "+c.price);
		c.startCar();
		c.stopCar();
	
			

	}

}

