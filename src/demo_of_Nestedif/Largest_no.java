package demo_of_Nestedif;

import java.util.Scanner;

public class Largest_no
{
	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter value of A ");    int a=sc.nextInt();
		 System.out.print("Enter value of B ");    int b=sc.nextInt();
		 System.out.print("Enter value of C ");    int c=sc.nextInt();  
		 
		// Find biggest no 
		 if(a==b && b==c)
		 {
			 System.out.println("All values are equal.");
		 }
		 else if(a>=b && a>=c)
		 {
			 if(a>b && a>c)
			 {
				 System.out.println("A is bigger. "+a);
			 }
			 else
			 {
				 if(a==b)
				 {
					 System.out.println("Both A and B are bigger. "+a);	 
				 }
				 else
				 {
					 System.out.println("Both A and C are bigger. "+a);
				 }	
			 }
		 }  
		 else if(b>=c)
		 {			 
			 if(b>c)
			 {
				 System.out.println("B is bigger. "+b);				 
			 }
			 else
			 {
				 System.out.println("Both B and C are bigger. "+b);
			 }
			 
		 } 
		 else 
		 {
			 System.out.println("C is bigger. "+c);
		 }
		 sc.close();
		 
	}
}
