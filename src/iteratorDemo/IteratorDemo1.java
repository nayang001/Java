package iteratorDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 
{

	public static void main(String[] args) 
	{
		ArrayList <Integer> arr=new ArrayList <>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		
		System.out.println(arr);
		
		Iterator i= arr.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
	}
}
