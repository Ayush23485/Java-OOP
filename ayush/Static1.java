package ayush;

class Demo{
	static int a,b,c;
	int x,y,z;
	
	static 
	{
		System.out.println("Static Init Block");
		a=10;
		b=20;
		c=30;
	}
	
	
	static void disp()
	{
		System.out.println("a : " +a);
		System.out.println("b : " +b);
		System.out.println("c : " +c);
	}
	
	
	{
	  x = 44;
	  y = 45;
	  z = 46;
	  System.out.println("Java Initialization Block");
	}
	
	Demo()
	{
		System.out.println("Cosntructor");
	}
	
	void disp2()
	{
		System.out.println("a : " +a);
		System.out.println("b : " +b);
		System.out.println("c : " +c);
		System.out.println("x : " +x);
		System.out.println("y : " +y);
		System.out.println("z : " +z);
	}
}

public class Static1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// First Static1 Class will be loaded in JVMs ecosystem
		// No static var/block in Static1
		
         Demo.disp();
         // Static Method can be accessed by Class Name
         // without creating object
         
         // without Demo;
         // Demo Class will not be loaded so nothing happens
         
         // Now JVM will allocate memory for static variables in Demo
         // Then Static execution block will be executed 
         
         
         Demo d2 = new Demo();
         // Everytime before call to constructor , Java Initializtion Block is executed
         d2.disp2();
	}

}
