package ayush;


class Parent {
    void show() {
        System.out.println("Parent show");
    }
    
    void display(String s) {
        System.out.println("Parent String");
    }
}

class Child extends Parent {
	@Override
    void show() {
        System.out.println("Child show");
    }
	
    void display(int a) {
        System.out.println("Child int");
    }
    
    void special()
    {
    	System.out.println("It is special method");
    }
}

public class Inherit3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Parent p = new Child();
	         p.show();
	        // Upcasting => Parent type ref utilizes Overriden method
	        ((Child)p).show();
	        //Downcasting => Temporaily make ref child type to acces specialized method of Child
	        
	        System.out.println();
	        System.out.println();
	        Child a = new Child();
	        a.display(8);
	        a.display("Ash");
	        // Method Overloading
	}

}





