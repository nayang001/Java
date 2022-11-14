package demo_of_Nestedif;
// Programm to find +ve and -ve number
import java.util.Scanner;

public class Positive_or_neg {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a value →");
		int a=sc.nextInt();
		
		if(a<0 || a>0)
		{
			if(a<0)
			{
				System.out.println(a+" is negative");
			}
			else
			{
				System.out.println(a+" is Positive");
			}
		}
		else
		{
			System.out.println("Number is "+a);
		}

	}

}
