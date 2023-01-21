package string;

public class Armstrong {

	public static void main(String[] args) 
	{
		int a=8565;
		int nod=0;
		System.out.println(a);
		
		for (int i=1;i<=a;i*=10)
		{
			nod++;
		}
		System.out.println(nod);
		
		int arm=0;int temp; int check=a;
		while(a>0)
		{
			temp=a%10;
			arm=arm+(int)Math.pow(temp, nod);
			a=a/10;
		}
		if(check==arm)
		{
			System.out.println("AN");
		}
		else
		{
			System.out.println("NOT AN");
		}
	}
}
