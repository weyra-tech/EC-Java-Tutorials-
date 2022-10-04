
public class Hello
{
	public String name;
	static int floorType =4;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		System.out.println("This is the Introduction");
		System.out.println("This is our first class");

		for(int i=0;i<4;i++)
		{
			int firstNumber=5;
			int secondNumber =5;
			int sum= firstNumber + secondNumber;
			System.out.println("the sum if the numbers "+ sum);
			int age=20;
			double ram= 4;
			int dotage=30;
			System.out.println("print "+age);
			System.out.println("the double number is \\" +ram);// this the first comment
			System.out.println("the dotage is "+dotage);
		}

		Hello bahirdar= new Hello();
		bahirdar.name="Bahirdar Hotel";
		System.out.println(bahirdar.name);
		Hello gonder = new Hello();
		gonder.name= "Gonder Hotel";
		System.out.println(gonder.name);
		System.out.println(Hello.floorType);
		AcesscModifier modifier= new AcesscModifier();
		System.out.println("from access modifer "+ modifier.descrition);

       int age=18;
	   int grade =10;
	   if(age >=15 || grade > 19)
	   {
		   System.out.println("I can go to cinema");
	   }
	   else
		   System.out.println("u r not eligible to go to cinema");


	   int x=5;
		System.out.println("before decrement "+ x);
	     ++x;
		System.out.println("post decremnet  "+ x);
	}





}
