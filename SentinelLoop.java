 import java.util.Scanner;
 
 public class SentinelLoop{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter numbers to sum (eneter -1 to stop):");
		
		int sum = 0;
		int num;
		
		//sentinel value is -1
		while (true) {
			System.out.println("Enter number: ");
			num = scanner.nextInt();
			
			if (num == -1) {
				break;
			}
			
			sum += num;
		}	
			
		System.out.println("The total sum is : "+ sum);
			
		scanner.close();
	}
}