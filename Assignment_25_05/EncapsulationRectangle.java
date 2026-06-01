package Assignment_25_05;

public class EncapsulationRectangle {
	
	private double length;
	private double width;
	
	
	void setLength(double l) {
		length=l;
	}

	
	void setwidth(double w) {
		width=w;
	}

	double getLength() {
		return length;
	}
	
	double getwidth() {
		return width;
	}
	
	
	public static void main(String[] args) {
		
		EncapsulationRectangle R = new EncapsulationRectangle();
		R.setLength(2);
		R.setwidth(4);
		
		
		System.out.println("length= "+R.getLength());
		System.out.println("width= "+R.getwidth());
	}
	
}
