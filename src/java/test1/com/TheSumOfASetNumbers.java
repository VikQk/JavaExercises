package test1.com;
import java.util.Scanner;

public class TheSumOfASetNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Until What?");
		int number = Integer.valueOf(scan.nextLine());
		int counter = 0;
		int sum = 0;
		while (true) {
			if (number!=counter) {
				counter++;
				sum = sum+counter;
			} else {
				System.out.println("Sum is " + sum);
				break;
			}
		}
	}

}
