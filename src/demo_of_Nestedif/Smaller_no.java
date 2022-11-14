package demo_of_Nestedif;
import java.util.Scanner;
public class Smaller_no 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter value of A");    int a=sc.nextInt();
		 System.out.println("Enter value of B");    int b=sc.nextInt();
		 System.out.println("Enter value of C");    int c=sc.nextInt();
		 
		 System.out.println("Value of A is "+a);    System.out.println("Value of B is "+b);   System.out.println("Value of C is "+c);    
		 
		// Find Smallest  no
		 
		 if(a==b && b==c)
		 {
			 System.out.println("All values are equal.");
		 }
		 else if(a<=b && a<=c)
		 {
			 if(a<b && a<c)
			 {
				 System.out.println("A is Smaller. "+a);
			 }
			 else
			 {
				 if(a==b)
				 {
					 System.out.println("Both A and B are Smaller. "+a);	 
				 }
				 else
				 {
					 System.out.println("Both A and C are Smaller. "+a);
				 }	
			 }
		 }  
		 else if(b<=c)
		 {			 
			 if(b<c)
			 {
				 System.out.println("B is Smaller. "+b);				 
			 }
			 else
			 {
				 System.out.println("Both B and C are Smaller. "+b);
			 }
			 
		 } 
		 else 
		 {
			 System.out.println("C is Smaller. "+c);
		 }
		 
	}

}
