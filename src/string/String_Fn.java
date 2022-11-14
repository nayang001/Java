package string;

public class String_Fn 
{

	public static void main(String[] args) 
	{
		String a="Velocity"; String i="Bhavsar"; String k="    Nayan       Bhavsar       ";
		String b="Velocity"; String j="BhaVsaR"; String p="I tried so Hard and got so Far, IN THE END ";
		
		String c=new String("Velocity");
		String d=new String("Velocity");
		
		System.out.println("1 → "+a.length()+" &&& "+i.length()+" &&& "+p.length());            System.out.println();
		System.out.println("2 → "+b.charAt(5));                                                 System.out.println();
		System.out.println("3 → "+a.equals(b)+" "+b.equals(c)+" "+c.equals(d)+" "+i.equals(j)); System.out.println();
		System.out.println("4 → "+a.toUpperCase()+" "+c.toLowerCase());                         System.out.println();
		boolean x=(a==b); boolean y=(a==c);  boolean z=(c==d);                           
		System.out.println("5 → "+x+" "+y+" "+z);                                               System.out.println();		
		System.out.println("6 → "+i.equals(j)+" "+i.equalsIgnoreCase(j));                       System.out.println();
		System.out.println("7 → "+a.isEmpty());                                                 System.out.println();
		System.out.println("8 → "+b.concat(" Class is Awesom"));                                System.out.println();
		System.out.println("9 → "+a.indexOf('t'));                                              System.out.println();
		System.out.println("9.1 → "+j.indexOf('R'));                                            System.out.println();
		System.out.println("10 → "+i.lastIndexOf('a'));                                         System.out.println();
		System.out.println("11 → "+b.replace('o','p'));                                         System.out.println();
		System.out.println("12 → "+k.trim());                                                   System.out.println();
		System.out.println("13 → "+k.startsWith(" s ")+" "+a.startsWith("Vel"));                System.out.println();
		System.out.println("14 → "+a.endsWith("ity")+" "+b.endsWith("Vel"));                    System.out.println();
		System.out.println("15 → "+a.substring(1,3)+" &&  "+p.substring(5,32));
	}

}
