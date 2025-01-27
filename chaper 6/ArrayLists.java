import java.util.ArrayList;

public class ArrayLists{
	public static void main (String[] args){
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("John");
		list.add("Henry");
		list.add("Mary");
		list.add("Jack");
		list.add("Blessing");
		
		
		//modifying the object of an array
		list.add (2, "Debbie");
		
		//updating using the method set
		list.set(3,"peter");
		
		// using the remove method using the values and index number
		list.remove("Henry");
		list.remove(3);
		
		// using the clear method
		//list.clear;
		
		for(String name : list){
		
		  System.out.printf("%s%n",name);
		}
		System.out.println(list.get(3));
		
	}
}