package lab10;
import java.util.Scanner;
public class Lab10part3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);//scanner since we need user input.
	        System.out.println("Please enter a word: ");
	        String word = scan.nextLine();
	        
	        
countE(word);//calls the method


	        
	    }

	    /**
	     * Explain the method
	     * @param count
	     */
	    static void countE(String word) {
	       
	    	char someChar = 'e';//defines for which char to look for
	    	int count = 0;//integer counts the number of "e" in a string
	    	  
	    	for (int i = 0; i < word.length(); i++) {
	    	    if (word.charAt(i) == someChar) {
	    	        count++;
	    	    }
	    	}
	    	System.out.println("The letter e is repeated " + count++  + " times"); //prints the number of times "e" is printed   	
	    	
	    	
	    	
	    	
	        }

	
		

		
	}
	

