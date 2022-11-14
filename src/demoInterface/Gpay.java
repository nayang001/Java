package demoInterface;
//Multiple inheritance is achieved by INTERFACE concept
public class Gpay implements SBI,HDFC,ICICI
{
	public void sendMoney() 
	{
		System.out.println("Payment done with the Google Pay");
		
	}
}
