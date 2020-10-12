package test1.com;
import java.util.*;

public class SeparatingCharacters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Give your name: ");
		String name = String.valueOf(scanner.nextLine());
		firstCharacter(name);
	}
	public static char firstCharacter(String text) {
		int position=0;
		while(position!=text.length()) {
			System.out.println("Character: " + text.charAt(position));
			position++;
		}
		return 0;
	}	
}
