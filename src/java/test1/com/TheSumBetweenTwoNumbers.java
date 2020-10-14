package test1.com;
import java.util.Scanner;

public class TheSumBetweenTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("First?");
		int first = Integer.valueOf(scan.nextLine());
		System.out.println("Second?");
		int second = Integer.valueOf(scan.nextLine());;
		int sum = 0;
		while (true) {
			if (first<=second) {
				sum = sum+first;
				first++;				
			} else {
				System.out.println("Sum is " + sum);
				break;
			}
		}
	}

}
