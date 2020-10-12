package test1.com;
import java.util.*;

public class LastCharacter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Give your name: ");
		String name = String.valueOf(scanner.nextLine());
		firstCharacter(name);
	}
	public static char firstCharacter(String text) {
		char last = text.charAt(text.length() - 1);
		System.out.println("Last character: " + last);
		return 0;	
	}	
}