import java.util.Random;
public class RandomNumbers{
	public static void main(String args[]){
		Random random = new Random();
		
		// create a variabkle to store the random number generated.
		int randomNum = random.nextInt();
		
		// print the  random number
		System.out.printf("Random Number is %d%n", randomNum);
		
		//Generating an integer within a range 
		int randomNumImRange = random.nextInt(20); // to include 20 add +1
		
		System.out.printf("RandomNumber In Range is :  %d%n",randomNumImRange);
		
		//Generating a float-point number
		double floatPointNum = random.nextDouble();
		
		System.out.printf("Randomfloat-point number is : %.2f%n",floatPointNum);
		
		//Generating  float-point within a range
		double min = 10.10;
		double max = 20.0;
		
		double floatPointNumInRange = min +(max - min)* random.nextDouble();
		System.out.printf("Random double Number In Range is : %.2f%n",floatPointNumInRange);
		
		//Generating a random boolean value
		boolean booleanValue = random.nextBoolean();
		System.out.printf("Random boolean value is : %b%n",booleanValue);
		
		
	}
	
}