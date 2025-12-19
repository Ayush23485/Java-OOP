package ayush;

class Calc
{
  void add(int a,double b)
  {
	  System.out.println(a+b);
	  System.out.println("Given priority");
  }
  
  int Calc()
  {
	  return 5;
  }
  
//  void add(double a,int b)
//  {
//	  System.out.println(a+b);
//  }
  
  // This upper method causes ambiguity because Compiler cant decide whom to give priority
  
  void add(double a,double b)
  {
	  System.out.println(a+b);
  }
} 

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calc c = new Calc();
        c.add(2, 5);
        System.out.println(c);
	}

}
