package lab10;
import java.util.Scanner;
public class Lab10Partone {

	public static void main(String[] args) {
	
	
		 Scanner scanner = new Scanner(System.in);//scanner since we need user input
	        System.out.println("Please enter the number");

	        while (scanner.hasNext()) {

	            int num = scanner.nextInt();

	            if (num < 1) {
	                System.out.println("Error! The number is less than 1. You entered --> " + num);
	            }else {
	                Alert(num);//calls the method
	            }

	            System.out.println("Do you want to try again? Enter yes or no");
	            String answer = scanner.next();

	            if (!answer.equalsIgnoreCase("yes")) {
	                System.out.println("arrivederci");
	                break;//repeats the process if the user enters yes
	            }

	            System.out.println("Please enter the number");
	        }
	    }

	    /**
	     * Explain the method
	     * @param count
	     */
	    static void Alert(int count) {
	        for (;count > 0;) {
	            System.out.println("Alert!");
	            count--;//when int is greater than 0, print "Alert."
	        }
	
		
		
	
		

}	
	}
	
	
	

