package test1.com;
import java.util.*;
public class TheLenghtName {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Give your Name: ");
		String text = String.valueOf(scanner.nextLine());
		calculateCharacters(text);		
	}
	public static int calculateCharacters(String text) {
		String stringText=text;
		System.out.println("Number of characters: " + stringText.length());
		return 0;			
		}
	}


