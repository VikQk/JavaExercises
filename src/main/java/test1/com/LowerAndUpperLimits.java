package test1.com;
import java.util.Scanner;
public class LowerAndUpperLimits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("First: ");
		int first = Integer.valueOf(scanner.nextLine());
		System.out.println("second");
		int second = Integer.valueOf(scanner.nextLine());
		while (true) {
			if (first<=second) {
			System.out.println(first);
			first++;
		    }  
			else {
			break;
		}
	}
}
}