package while_loop_stat;

public class Armstrong_no 
{

	public static void main(String[] args) 
	{
		int nod=0; int num=153;
		for (int a=1;a<num;a*=10)
		{
			nod++;
		}
		
		int cheak=num;  int arm=0;
		int temp;
		while(num>0)
		{
			temp=num%10;
			arm=arm+(int)Math.pow(temp, nod);
			num=num/10;
		}
		if(cheak==arm)
		{
			System.out.println("Given value is Armstrong number");
		}
		else
		{
			System.out.println("Given value is NOT Armstrong number");
		}
		

	}

}
