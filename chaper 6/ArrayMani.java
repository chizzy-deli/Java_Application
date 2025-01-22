import java.util.Scanner;

public class ArrayMani{
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int [] number = new int[10];
		
		int sum = 0;
		int sum2 = 0;
		int sub = 0;
		
		 for(int i = 0; i < 10; i++){
			 System.out.print("Enter a number: ");
			 number[i] = scan.nextInt();
			 
			 sum = number[1] + number[2] + number[3] + number[4] + number[5];
			 sum2 = number[6] + number[7] + number[8];
			 sub = sum2 -sum;
		 }
		 System.out.printf("subtraction of the numbers is %d ",sub);
	}
}