

package Assignment_21_05;

public class Book {
	
	String title;
	String author;
	double price;

	public void displayBook() {
		System.out.println("title is " +title);
		System.out.println("author is " +author);
		System.out.println("price is " +price);
	}


	public static void main(String[] args) {
		
		Book B = new Book();
		B.author = "Siri";
		B.price = 500.02;
		B.title = "Heaven";
		B.displayBook();
		



	}

}
