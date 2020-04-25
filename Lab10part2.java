package lab10;
import java.util. Scanner;
public class Lab10part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);//scanner since we need user input
		System.out.println("Enter a word: ");
		String word = scan.nextLine();
		
		System.out.println("How many times do you want the word to be repeated: ");
		int num= scan.nextInt();
		
		//the String word and int num act as substitutes for String str and int count in the method
		
		
		
		multiConcat(num, word);//calls the method
		
		
		
		
		
		
	}

	
 public	static void multiConcat( int count, String str) {
	 String concat = "";

	 for(int i=0; i<count; i++)

	 {

	 concat = concat + str;

	 }

	 System.out.println(concat);//prints out the concatenated string
	 
	    
		
 
	
		
		
		
		
		
	}
 
 
 

}
