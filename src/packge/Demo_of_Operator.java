package packge;

public class Demo_of_Operator {
	public static void main(String[] args) 
	{ 
		//ARITHMATIC OPERATOR---------------------------------------------------------------------
		int a=9; int b=50; int c=32; double d=5.6; int e=9; double z;
		
		System.out.println("Value of a is  "+a);
		System.out.println("Value of b is  "+b);
		System.out.println("Value of c is  "+c);
		System.out.println("Value of d is  "+d);
		System.out.println();
		
		System.out.println("a+b is  "+(a+b));
		System.out.println("a-b is  "+(a-b));
		System.out.println("b*c is  "+(b*c));
		System.out.println("c/a is  "+(c/a));
		System.out.println("Remainder of c/a is  "+(c%a));
		System.out.println("a/c  "+(a/c));
		System.out.println("Remainder of a/c is  "+(a%c));
		System.out.println("Value of z is  "+(z=a+b+c+d));
		System.out.println("Value of a is  "+(a=56));  //NEW VALUE IS ASSIGNED TO A. OLD VALUE IS REPLACED.
		System.out.println("Value of z is  "+(z=a+b+c+d));
		System.out.println("Value of z is  "+(z=a+(b=100)+c+d));// NEW VALUE IS ASSIGNED TO B BY REPLACING OLD VALUE. 
		z++;
		System.out.println("Value of z is  "+z);
		System.out.println("Addition of a and b is  "+(a+b));
		z++;
		System.out.println("Value of z is  "+z);
		System.out.println();
		
		
		//RELATIONAL OPERATOR---------------------------------------------------------------------
	
		System.out.println("a>b is  "+(a>b));
		System.out.println("a<b is "+(a<b));
		System.out.println("b==c is "+(b==c));
		System.out.println("c>=d is "+(c>=d));
		System.out.println("c<=d is "+(c<=d));
		System.out.println("a!=b is  "+(a!=b)); 
		System.out.println("a!=e is  "+(a!=e));	
		System.out.println();
		
		//LOGICAL OPERATOR--------------------------------------------------------------------------------------
		
		boolean p=true;  boolean r=true;
		boolean q=false; boolean s=false;
		
		System.out.println("p&&q is "+(p&&q));
		System.out.println("p&&r is "+(p&&r));
		System.out.println("p||q is "+(p||q));
		System.out.println("p||r is "+(p||r));
        System.out.println("p! is "+!p);
        System.out.println("!(p&&q) is "+!(p&&q));
        System.out.println();
        
        //CHARECTER----------------------------------------------------------------------------------------------
        
        char A='B';
        System.out.println("A");
       
        String myname= "Nayan bhavsar";
        System.out.println("My name is "+myname);
  
           }
}
