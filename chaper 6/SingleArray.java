public class SingleArray{
	public static void main(String[] args){
		
		int [] ages = {12,18,15,35,20};
		String [] names = {"Jack", "Mark","Chisom","Kim","Becca"};
		//craeting an array using the new keyword
		int [] numbers = new int [5];
		numbers[0]= 15;
		numbers[1]= 30;
		numbers[2]= 32;
		numbers[3]= 12;
		numbers[4]= 31;
		
		System.out.printf("Name is %s and age is %d%n",names[0],ages[0]);
		System.out.printf("The number at the 2nd position is : %d%n", numbers[1]);
		
	}
}