package test1.com;
import java.util.*;

public class FirstCharacter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Give your name: ");
		String name = String.valueOf(scanner.nextLine());
		firstCharacter(name);
	}
	public static char firstCharacter(String text) {
		String stringText=text;
		System.out.println("First character: " + stringText.charAt(0));
		return 0;	
	}	
}
