import java .util.Scanner;
public class FindSmallestValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the numberof values to input: ");
		int numValues = input.nextInt();
		
		if (numValues <= 0){
			System.out.println("Number of values must be greater than 0");
			return;
		}
		System.out.print("Enter " + numValues + " integer:");
		int smallest = Integer.MAX_VALUE;
		
		for (int i = 0; i < numValues; i++){
			int value = input.nextInt();
			if(value < smallest){
				smallest = value;
			
			}
		}
		System.out.println("The smallest valueis : " + smallest);
	}
}