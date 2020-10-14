package test1.com;
import java.util.*;

public class ReversingName {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Type your name: ");
		String name = String.valueOf(scanner.nextLine());
		int reverse;
		System.out.print("In reverse order: ");
		for(reverse=name.length()-1;reverse>=0;reverse--) {
			System.out.print(name.charAt(reverse));
		}
		
	}	
}