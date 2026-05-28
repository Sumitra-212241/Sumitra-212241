package Assignment_21_05;

public class JavaDataTypes {
	
	public int getInt()
	{
		return 1;
	}
	
	public double getDouble()
	{
		return 2.5;
	}
	
	public boolean getBoolean()
	{
		return true;
	}
	
	
	public String getString()
	{
		return "Suma";
	}

	public static void main(String[] args) {
		
		JavaDataTypes T = new JavaDataTypes();
		System.out.println("Int value is "+T.getInt());
		System.out.println("Double value is "+T.getDouble());
		System.out.println("Boolean value is "+T.getBoolean());
		System.out.println("String value is "+T.getString());

	}

}
