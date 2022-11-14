package accSpe;

public class Call_MethodAccSpe 
{

	public static void main(String[] args) 
	{
		MethodAccSpe obj= new MethodAccSpe();
		obj.add(48, 440); //default called
		obj.mul(21, 15);  //public called
//		obj.div(15, 3);   //private can not call
		obj.sub(78, 10);  //protected called

	}

}
