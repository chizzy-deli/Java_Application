import java.util.Random;
import java.util.Scanner;

public class RandomNum{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Enter the max value");
		int maxValue = scan.nextInt();
		
			
		int randomNum = random.nextInt(maxValue) + 1;
		
		// print the  random number
		System.out.printf("RandomNumber from 0 - %d is : %d%n",maxValue,randomNum);
		
	}	
}