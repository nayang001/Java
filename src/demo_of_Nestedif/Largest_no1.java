package demo_of_Nestedif;

import java.util.Scanner;

public class Largest_no1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter value of A");    int a=sc.nextInt();
		 System.out.println("Enter value of B");    int b=sc.nextInt();
		 System.out.println("Enter value of C");    int c=sc.nextInt();
		 
		 System.out.println("Value of A is "+a);    System.out.println("Value of B is "+b); 
		 System.out.println("Value of C is "+c);    
		 
		// Find biggest no 
		 if(a==b && b==c)
		 {
			 System.out.println("All values are equal.");
		 }
		 else if(a>b)
		 {
			 if(a>c)
			 {
				 System.out.println("A is bigger. "+a);
			 }
			 else
			 {
				 System.out.println("C is bigger. "+c);
			 }
		 }  
		 else if(b>c)
		 {			 
			 System.out.println("B is bigger. "+b);
		 }
		 else
		 {
			 System.out.println("C is bigger. "+c);
		 }	 
	/////////////////////////		 
		 if (a==b) 
		 {
			 if(a>c)
			 {
				 System.out.println("A and B is bigger. "+a);
			 }
			 else
			 {
				 System.out.println("C is bigger. "+c);
			 }
		 }
		 else if (b==c)
		 {			 
			 if (b>a)
			 {
				 System.out.println("B and C is bigger. "+b);
			 }
			 else
			 {
				 System.out.println("A is bigger. "+a);
			 }
		 }
		 else if (a==c)
		 {
			 if (a>b) 
			 {
				 System.out.println("A and C is bigger. "+c);
			 }
			 else
			 {
				 System.out.println("B is bigger. "+b);
			 }
		 }	
	}
}
