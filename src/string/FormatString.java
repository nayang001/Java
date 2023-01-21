package string;

public class FormatString {

	public static void main(String[] args) 
	{
		String name="sonoo";  
		String sf1=String.format("name is __{%s}",name);  
		String sf2=String.format("value is %s",32.33434);  
		String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0  
		String sf4=String.format(name+" is %s","djnv"+name+"adfa");
		
		System.out.println(sf1);  
		System.out.println(sf2);  
		System.out.println(sf3);
	}

}
