public class LogicalOperators{
	public static void main(String[] args){
		int x = 50;
		int y = 25;
		int z = 15;
		
		boolean display = (x > y)&& (x <= z);
		System.out.println(display);
		
		boolean display2 = (x > y)||(x <= z);
		System.out.println(display2);
		
		boolean display3 = !((x > y)&&(x <= z));
		System.out.println(display3);
	}
}