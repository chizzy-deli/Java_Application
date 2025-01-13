import java.util.Scanner
 
 public class CreditLimit{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int accountNumber;
		int beginningBalance;
		int charges;
		int credits;
		int creditLimits;
		int newBalance;
		
		System.out.print("Enter account number: ");
		accountNumber = scan.nextInt();
		
		for (int i =1; i <= accountNumber; i++{
			System.out.print("Enter charges:  ");
			charges = scan.nextInt();
			
			System.out.print("Enter credits: ");
			credits = scan.nextInt();
			
			System.out.print("Enter credits limits: ");
			creditLimits = sacn.nextInt();
			
			newBalance = beginningBalance + charges -credits;
			System.out.printf("New balance: %d\n", newBalance);
			
			if(newBalance > creditLimits){
				System.out.println("Credit limits exceeded.")
			}
			
		}
		input.close();	
	}
 }