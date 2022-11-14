package method_hard;

import java.util.Scanner;

public class Starall_switch 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number between 1 to 10 ");
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
		{
			System.out.println("Star printed in square");          Starall1.s();
			break;
		}
		case 2:
		{
			System.out.println("Star printed in 1-5 Triangle");    Starall1.t15();
			break;
		}
		case 3:
		{
			System.out.println("Star printed in 5-1 Triangle");    Starall1.t51();
			break;
		}
		case 4:
		{
			System.out.println("Star printed in 1-5-1 Triangle");  Starall1.t151();
			break;
		}
		case 5:
		{
			System.out.println("Star printed in s-1-5 Triangle");  Starall1.ts15();
			break;
		}
		case 6:
		{
			System.out.println("Star printed in s-5-1 Triangle");  Starall1.ts51();
			break;
		}
		case 7:
		{
			System.out.println("Star printed in 1-5-1 Triangle");  Starall1.ts151();
			break;
		}
		case 8:
		{
			System.out.println("Star printed in 1-9 Triangle");    Starall1.t19();
			break;
		}
		case 9:
		{
			System.out.println("Star printed in 9-1 Triangle");    Starall1.t91();
			break;
		}
		case 10:
		{
			System.out.println("Star printed in 9-1-9 Triangle");  Starall1.t191();
			break;
		}
		default:
		{
			System.out.println("Invalid number. Please try again with valid number.");
			
		}
		}
		sc.close();
	}

}
/// THERE ARE NO USER DEFINED METHOD IN HERE BUT ALL THIS USER DEFINED METHODS
/// ARE DEFINED IN Starall1 PROGRAMM AND THEY ARE CALLED HERE