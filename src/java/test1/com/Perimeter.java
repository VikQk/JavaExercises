package test1.com;
import java.util.*;

public class Perimeter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		System.out.println("Select the perimeter to calculate:(triangle,square,rect or quit): ");
		String selection = String.valueOf(scanner.nextLine());		
		
		
		if (selection.equals("quit")) {
			System.out.println("Thanks! Bye!");
			break;		
		}
		System.out.println("Select Height: ");
		int first = Integer.valueOf(scanner.nextLine());
		System.out.println("Select Base: ");
		int second = Integer.valueOf(scanner.nextLine());
						
		if (selection.equals("triangle")){
			triangle(first,second);
		}
		if (selection.equals("square")) {
			square(first,second);
		}
		if (selection.equals("rect")) {
			rect(first,second);
		}
		}
	}
	
	public static void triangle(int first, int second) {		
		int result= (first*second)/2;
		System.out.println("The perimeter of triangle is: "+result);
	}
	
	public static void square(int first, int second) {		
		int result = (first+second)*2;
		System.out.println("The perimeter of square is: "+result);
	}
	
	public static void rect(int first, int second) {
		int result = (first+second)*2;	
		System.out.println("The perimeter of rect is: "+result);
	}
}
