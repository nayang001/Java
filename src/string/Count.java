package string;

public class Count 
{

	public static void main(String[] args) 
	{
		String a="My name is Nayan Bhavsar";
		int l=a.length();System.out.println(l);
		
		int flag=0;
		for (int i=0;i<l;i++)
		{
			flag++;
		}
		System.out.println(flag);
	}

}
