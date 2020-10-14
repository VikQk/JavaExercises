package test1.com;
import java.util.*;

public class SeparatingFirstCharacters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Give your name: ");
		String name = String.valueOf(scanner.nextLine());
		Separator(name);
	}
	public static char Separator(String text) {
		String stringText=text;
		System.out.println("First character: " + stringText.charAt(0));
		System.out.println("Second character: " + stringText.charAt(1));
		System.out.println("Third character: " + stringText.charAt(2));
		return 0;	
	}	
}
