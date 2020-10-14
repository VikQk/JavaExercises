package test1.com;
import java.util.*;


public class RecurringWord {
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 ArrayList<String> words = new ArrayList<String>(); 
		while (true) {
			 System.out.print("Type a word: ");		
			 String answer = scanner.nextLine();
			if(words.contains(answer)) {
			System.out.println("You gave the word " + answer + " twice.");
			break;	 
		    }
		}
	}

}
