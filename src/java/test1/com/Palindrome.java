package test1.com;
import java.util.*;
public class Palindrome {

	public static boolean palindrome(String text) 
	{		
		int reverse = text.length()-1;
		for(int i=0;i<text.length()-1;i++) {
			if (text.charAt(i)== text.charAt(reverse)) {
		return true;
		}
		}
		return false;
	}

		public static void main(String[] args) 
		{
		Scanner reader = new Scanner(System.in); 
		System.out.println("Type a text: "); 
		String text = reader.nextLine(); 

		if (palindrome(text)) { 
		System.out.println("The text is a palindrome!"); 
		} else { 
		System.out.println("The text is not a palindrome!"); 
		} 
	}
}
