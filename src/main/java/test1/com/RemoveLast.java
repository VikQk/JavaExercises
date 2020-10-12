package test1.com;
import java.util.*;
public class RemoveLast {

	public static void main(String[] args)
	{
		ArrayList<String> brothers = new ArrayList<String>();
		brothers.add("Dick"); 
		brothers.add("Henry"); 
		brothers.add("Michael"); 
		brothers.add("Bob"); 
		System.out.println("brothers:"); 
		System.out.println(brothers); 
		brothers.remove(brothers.size()-1); 
		System.out.println(brothers);


	}

}
