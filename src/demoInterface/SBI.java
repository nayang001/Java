package demoInterface;

public interface SBI 
{
	void sendMoney();
	default void AAAA()
	{
		System.out.println("Payment avzdh the Google Pay");
	}
}
