package mypro;
import java.util.Scanner;
public class leap_year 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Year");
		int a=sc.nextInt();
		
		if (a % 400 == 0) 
		{
			System.out.println(a+" is a Leap Year");
		}

		else if (a % 100 == 0) 
		{
			System.out.println(a+" is not a Leap Year");
		}

		else if (a % 4 == 0) 
		{
			System.out.println(a+" is a Leap Year");
	    }
		else
		{
			System.out.println(a+" is not a Leap Year");
		}
	}

}
