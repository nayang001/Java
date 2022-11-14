package forCall;


import accSpe.MethodAccSpe;

public class Call1_MethodAccSpe 
{

	public static void main(String[] args) 
	{
		MethodAccSpe obj= new MethodAccSpe();
//		obj.add(48, 440);            //default can not call
		obj.mul(21, 15);  //public called
//		obj.div(15, 3);              //private can not call
//		obj.sub(78, 10);             //protected can not call

	}

}
