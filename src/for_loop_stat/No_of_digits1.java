package for_loop_stat;
//PROGRAM TO FIND NO OF DIGITS IN A NUMBER
public class No_of_digits1 
{

	public static void main(String[] args) 
	{
		int num=61651; int nod=0; //nod = Number of digits
		for (int a=1;a<=num;a*=10)
		{
			nod++;
		}
		System.out.println(nod);

	}

}
