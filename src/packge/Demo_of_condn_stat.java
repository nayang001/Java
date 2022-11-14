package packge;

public class Demo_of_condn_stat 
{

	public static void main(String[] args) 
	{
		// 'if' STATEMENT
		
		int a=-10;
		if(a>0)
		{
			System.out.println("A is +ve no");
		}
		if(a<0)
		{
			System.out.println("A is -ve no");
		}
		
		//'if else' STATEMENT
		int b=12;
		if(b>0)
		{
			System.out.println("B is +ve no");
		}
		else
		{
			System.out.println("B is -ve no");
		}
		
		//'if else ladder' Statement
		int c=0;
		if(c>0)
		{
			System.out.println("C is +ve no= "+c);
		}
		else if(c<0)
		{
			System.out.println("C is -ve no= "+c);
			
		}
		else
		{
			System.out.println("C is "+c);
		}
	}

}
