package useOfthisAndsuper;
//Subclass Method
public class Dog extends Animal
{
	void eat()
	{
		System.out.println("Dog is eating");
	}
	
	void bark()
	{
		System.out.println("Dog is barking");
	}
	
	void test()
	{
		super.eat();
		super.bark();
		
		this.eat();
		this.bark();
	}
	
	public static void main(String[] args) 
	{
		Dog obj=new Dog();
		obj.test();
	}

}
