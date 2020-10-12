package Bank;
import java.util.*;

public class Account {
	
    private double balance;
    private String owner;
    private String password;
    private int visits = 0;
    Scanner scanner = new Scanner(System.in);
    
 
    public Account(String owner, double balance) {
    	this.balance = balance;
        this.owner = owner;
    }
    public Account(String owner,String password) {//en proyecto
    	this.balance = balance;
        this.owner = owner;
        this.password = password;
		while (this.password.equals(password)&&visits==0) {
        	
        	visits++;
        	if(visits==1) {
        		
        		System.out.print("pass succeful!");
        	}else if(visits!=1 || this.equals(password)){
        		System.out.println("Error! Disconnected.");
        		break;
        	}
        }
        
    }
     
   	public void deposit(double amount) {
        balance += amount;
    }
 
    public void withdrawal(double amount) {
        balance -= amount;
    }
 
    public double getBalance() {
        return balance;
    }
 
    public String getOwner() {
		return owner;
	}

    public void setOwner(String owner) {
		this.owner = owner;
	}

    public void setBalance(double balance) {
		this.balance = balance;
	}

    @Override
    public String toString() {
        return owner + " balance: " + balance;
    }


}

