package finalproj;
import javax.swing.JOptionPane;

public class finalproject2 {
	// Node class 
	static class Node 
	{ 
	    int data; 
	    Node next; 
	    Node(int d) 
	    { 
	        data = d; 
	        next = null; 
	    } 
	} 
	  
	// Linked list class 
	static class LinkedList 
	{ 
	    Node head;    //Head of list 
	  
	    //Inserts a new node at the front of the list 
	    public void push(int new_data) 
	    { 
	        //Allocate new node and putting data 
	        Node new_node = new Node(new_data); 
	  
	        //Make next of new node as head 
	        new_node.next = head; 
	  
	        //Move the head to point to new Node 
	        head = new_node; 
	    } 
	  
	    // Checks whether the value x is present 
	    // in linked list 
	    public boolean search(Node head, int x) 
	    { 
	        // Base case 
	        if (head == null) 
	            return false; 
	  
	        // If key is present in current node, 
	        // return true 
	        if (head.data == x) 
	            return true; 
	  
	        // Recur for remaining list 
	        return search(head.next, x); 
	    } 
	  
	    // Driver function to test the above functions

	public static void main(String[] args) {
		// Start with the empty list 
        LinkedList llist = new LinkedList(); 
  
        /* Use push() to construct below list 
           14->21->11->30->10  */
        llist.push(10); 
        llist.push(30); 
        llist.push(11); 
        llist.push(21); 
        llist.push(14);
        
        String num1;
        int number1;
        
        num1 = JOptionPane.showInputDialog("Enter your ticket number for the Grand party");
		number1 = Integer.parseInt(num1);
  
        if (llist.search(llist.head, number1)) 
        	JOptionPane.showMessageDialog(null, " Welcome, guest with ticket number " + number1 + ", drinks are on the house", num1, JOptionPane.PLAIN_MESSAGE ); 
        else
        	JOptionPane.showMessageDialog(null, "Sorry, you are an imposter, your ticket number " + number1 + " could not be found, please leave the party", num1, JOptionPane.PLAIN_MESSAGE );

	}
	}
}

