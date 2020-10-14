package test1.com;

import java.util.*;

public class ReversingText {

	public static String reverse(String text) { 
		String help;
		char letras []=new char[text.length()];
		for (int i=text.length()-1;i>=0;i--) {
			letras[i]=text.charAt(i);
			}
		System.out.println(letras);
		return text;		
		} 

		public static void main(String[] args) 
		{ 
		Scanner reader = new Scanner(System.in);
		System.out.print("Type in your text: "); 
		String text = reader.nextLine(); 
		System.out.println("In reverse order: " + reverse(text)); 
		}
}

