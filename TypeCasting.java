public class TypeCasting{
	public static void main(String[]args){
		// widening(inplicit) from int to double
		int num1 = 100;
		double d = (double) num1;
		
		System.out.println(d);
		
		// narrowing (Explicit) from long to int
		long LongValue = 1000000000L;
		int intValue = (int) LongValue;
		
		System.out.println(intValue);
		
		// Explicit conversion but dat willl be lost
		double num = 100.99;
		int i = (int) num;
		System.out.println(i);
	}
}