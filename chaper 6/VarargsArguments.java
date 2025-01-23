public class VarargsArguments{
	public static void main(String args[]){
		System.out.println(add(5,6,7,8,9))
		listOfNames("martines","kate","sef");;
	}
	
	public static int add(int...numbers){
		int sum = 0;
        for(int number : numbers){
			sum += number;
		  
		}
		return sum;
	}
	
	public static void ListOfNames(String ...names){
		for(String name : names){
			System.out.printf("%s%n",names);
		}
	}
}