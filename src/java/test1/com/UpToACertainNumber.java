package test1.com;
import java.util.Scanner;

public class UpToACertainNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Up to what number?");
		int start = Integer.valueOf(scanner.nextLine());
		System.out.println("Up to what number?");
		int end = Integer.valueOf(scanner.nextLine());
		while (true) {
			if (start <= end) {
				System.out.println(start);
				start++;
			}else {
				break;
			}
		}
	}

}
