package methods_demo_ADD;
//STATIC WITH RETURN NO ARGUMENT

public class Add_S_WRNA 
{
	public static int Add()
	{
		int a=45;
		int b=75;
		int c=a+b;
		return c;
		
	}
	
	public static void main(String[] args) 
	{
		Add_S_WRNA.Add(); //Calling STATIC Method
		int z=Add_S_WRNA.Add();// Assigning value of Static method to variable
		System.out.println(z);

	}

}
