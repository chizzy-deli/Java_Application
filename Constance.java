//write a java progaram to create a class called constance with a static variable pi initialised to the value of pi. 
//create a method called area to calculate the area of a circle with radius inputed by the user

import java.util.Scanner;
import math.pi;

public class Constance{
	  static final double  pi = math.pi;
	 
	  public static void main(String[] args){
		  Scanner scan = new Scanner(System.in);
	    
    	   	  
		System.out.print("Enter radius: ");
		int radius  = scan.nextInt();
		
		System.out.println(StaticMethod.area(radius));
		
	}
	 public static double  area() {
		 double area;
         return area = math.pi * radius*radius;			
		     	 
    }
}

//public class Constance{
	//static final double pi = 3.142 // the value cannot be changed
	 // public static void main(String[] args){
		  
		  // Scanner scan = new Scanner(System.in);
		  
		//System.out.print("enter radius: ");
		//int radius  = scan.nextInt();
		
		//Contance.area(radius)
//public static void area(int radius){
	//double area = pi * radius*radius;
}
	