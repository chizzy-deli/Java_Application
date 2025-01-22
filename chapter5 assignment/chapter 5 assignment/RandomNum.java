import java.util.Random;
import java.util.Scanner;

public class RandomNum{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the min value");
		System.out.println("Enter the max value");
		int rangeValue = scan.nextInt();
		int minValue = scan.nextInt();
		int maxValue = scan.nextInt();
		
		
		Random random = new Random();
		int randomNum = random.nextInt()
		
		// print the  random number
		System.out.printf("RandomNumber is :  %d%n",random);
		
	}	
}