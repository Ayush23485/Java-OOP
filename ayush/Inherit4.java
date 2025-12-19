package ayush;

class Demo4
{

	static int a;
	
	public static void disp()
	{
		a=10;
		System.out.println(a+ " parent class disp");
	}
	public void show()
	{
		System.out.println("show of parent");
	}
}


class Demo5 extends Demo4
{
	
	public static void disp()//method hiding
	{
		a=10;
		
		System.out.println(a + " child class disp");
	}
	
	public void show()
	{
	
		System.out.println("show of child");
	}
}

public class Inherit4
{

	public static void main(String[] args) 
	{
		
			Demo4 d=new Demo5();
			d.disp();
			d.show();
			
			//Demo4.disp();
			System.out.println("**********************");
			Demo5.disp();
//			Demo5 d2=new Demo5();
//			d2.disp();
	}

}
