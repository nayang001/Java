package practice;

public class ConstructorEG {

	String name;


	  // default constructor
	  ConstructorEG(){
	    name = "example";
	    System.out.println("Constructor called");
	  }

	  public static void main(String[] args) {
	    ConstructorEG object = new ConstructorEG();
	    System.out.println(object.name);
	  }

}
