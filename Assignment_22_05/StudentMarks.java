package Assignment_22_05;

public class StudentMarks {

	public static void main(String[] args) {
		
		int marks =75;
		int status;
		
	     if (marks >=35) {
	    	 status =1;
	    	 
	     }else {
	    	 status =0;
	     }
		
		switch(status) {
		case 1:System.out.println("Pass");
		break;
		default:System.out.println("Fail");
		}

	}

}
