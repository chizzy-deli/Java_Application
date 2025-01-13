import java.util.Scanner;

public class MethodOverLoading{
    public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("******Menu*****");
		System.out.println("Enter 1 to calculate perimeter of square");
		System.out.println("Enter 2 to calculate perimeter of rectangle");
		
		int option = scan.nextInt();
		
		switch(option){
			case 1:
			{
			       System.out.print("Enter length of the square: ");
				   int length = scan.nextInt();
				   
			       MethodOverLoading.shape(length);
		    }
			break;
			
			case 2:
			{
			       System.out.print("Enter length of the rectangle: ");
				   int length = scan.nextInt();
				    
				   System.out.print("Enter breadth of the rectangle: ");
				   int breadth = scan.nextInt();
				   
			      MethodOverLoading.shape( length, breadth);
			}
			break;
			
			default:
			        System.out.println("Invalid input");
		}
		
    }
    public static void shape(int length) {
		int perimeterOfSquare = 4 * length;
		System.out.printf("The Perimeter of the Square is %d",perimeterOfSquare);
    }
    public static void shape(int length,int breadth) {
		int perimeterOfRectangle = 2 * length + breadth;
		System.out.printf("The Perimeter of the Rectangle is %d",perimeterOfRectangle);
    }
}