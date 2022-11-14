package mypro;
//Program to find the type of Given number i.e. Natural or Whole etc//
import java.util.Scanner;
public class Number_type 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter any Number");
		double a=sc.nextDouble();  System.out.println("Giver input is "+a);
		
		//Rational number is a type of real number, which is in the form of p/q where q is not equal to zero.
	    //Some of the examples of rational numbers are 1/2, 1/5, 3/4
		
		if(a<=0 || a>0)
		{
			System.out.println(a+" is an Rational number.");
			
			if(a%2==0 || a%2==1 || a%2==-1)
			{
				System.out.println(a+" is an Integer number which is i=-3,-2,-1+[All Whole numbers]");
				
				if(a%2==0 || a%2==1)
				{
					System.out.println(a+" is a Whole number which is w=0+[All Natural numbers]");
					
					if (a>0)
					{
						if(a==1 || a%2==0 || a%2==1)
						System.out.println(a+" is a Natural number which is n=1,2,3,4,......");
					}
				}
				
			}
		}
		
		
	}

}
