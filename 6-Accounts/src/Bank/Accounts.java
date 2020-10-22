package Bank;
import java.util.*;

public class Accounts {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		Account natalia = new Account("Natalia",150.00);
		natalia.deposit(50);
		natalia.withdrawal(10.00);
		
		Account pedro = new Account("Pedro",1500.00);
		pedro.setBalance(1512.00);
		
		Account luis = new Account ("Luis",2500.00);
		luis.setBalance(2512.00);
		
		
		//System.out.println(natalia);	
		
		//transfer(luis,natalia);
		
		//personalCredit(natalia);
		
		yourMethod("");
		
		
				
	}
	
	public static void transfer (Account from, Account to) 
	{
		System.out.println("Write the amount to transfer: ");
		double cantidad = Double.valueOf(scanner.nextLine());
		from.withdrawal(cantidad);
		to.deposit(cantidad);
		System.out.println("Your transfer has succeful!");	
		System.out.println("Your actual balance is: " + from.getBalance());
	}
	
	
	public static void personalCredit  (Account credit) 
	{	
		System.out.println("Select the quantity: ");
		double quantity = Double.valueOf(scanner.nextLine());
		credit.deposit(quantity);
		System.out.println("Your credit has succefully transfer!");
		System.out.println("0.05% will be discounted each month: " + quantity*0.05/100 + "€ aprox.");	
		
	}

	public static void yourMethod (String name) 
	{
		System.out.println("Enter your username: ");
		name = String.valueOf(scanner.nextLine());
		System.out.println("Enter your Password: ");
		String password = String.valueOf(scanner.nextLine());
		System.out.println("Thanks! Welcome to your new bank!");
		Account victor = new Account(name,password);
		System.out.println(victor);		
	}
	
		

}

