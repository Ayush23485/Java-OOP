package ayush;

class Telusko
{
	private int age = 22;
	
	void disp()
	{
		System.out.println("Telusko is " + age);
	}
}

class Alien extends Telusko
{
	void disp2()
	{
		age = 25;
	}
}

public class Inherit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Alien a = new Alien();
        a.disp();
       
	}

}

//Make age private;
