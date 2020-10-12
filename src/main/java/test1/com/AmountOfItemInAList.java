package test1.com;
import java.util.*;
public class AmountOfItemInAList {

	public static int countItems(ArrayList<String>list) 
	{
		list.add("Hallo");
		list.add("Ciao");
		list.add("Hello");
		System.out.print("There are this many items in the list: ");   
		System.out.println(list.size());
		return list.size();
	}
	public static void main(String[] args) 
	{
		ArrayList<String> str = new ArrayList<String>();
		
		countItems(str);		
	}
}
