import java.util.Arrays;

public class UsingArraysClass{
	public static void main(String[] args){
		//using sort method
		int [] numbers = {6,19,2,20,10,30,8,3,12,4};
		Arrays.sort(numbers);
		
		
		for(int element : numbers){
			System.out.printf("%d%n", element);
		}
		System.out.println("=====================================");
		
		//using binarySearch methood
		int index = Arrays.binarySearch(numbers,30);
		
		System.out.printf("the index number of 30 is %d%n",index);
		System.out.println("=====================================");
		
		//using equals method
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		boolean isEqual = Arrays.equals(arr1,arr2);
		
		System .out.printf("%b%n",isEqual);
		System.out.println("=====================================");
		
		//Using the fill method
		int[] MyArrays = new int[5];
		Arrays.fill(MyArrays,20);

		for(int component : MyArrays){
			System.out.printf("%d%n", component);
		}
		System.out.println("=====================================");
		
		//using the copy method
		int[] original = {1,2,3};
		int [] copy = Arrays.copyOf(original,5);
		
		for(int value : copy){
			System.out.printf("%d%n", value);
		}
		System.out.println("=====================================");
		
	    //using the tostring method
	    String copyArray = Arrays.toString(copy);
		System.out.printf("%s%n", copyArray);
		
		System.out.println("=====================================");
		
	}
	
}	//System.out.printf