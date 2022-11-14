package seleniumDemo;

import java.util.ArrayList;

public class ArrayListDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<String> arr=new ArrayList();
		
		arr.add("Nayan");
		arr.add("Rahul");
		arr.add("Laksham");
		
		System.out.println(arr);
		String x=arr.get(0);
		System.out.println(x);
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));

	}

}
