package ayush;

class Student
{
	int id;
	String name;
	String city;
	
	static int count;
	
	{
		count++;
	}
	
	Student()
	{
		System.out.println("Zero Param Construtor");	
	}
	
	Student(int id , String name, String city)
	{
		this.id = id;
		this.city = city;
		this.name = name;	
	}
	
}


public class Static2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st1 = new Student(1,"Rohan","Banglore");
		System.out.println("No of objects :"+ Student.count);
		Student st2 = new Student(2,"Mohit","Pune");
		System.out.println("No of objects :"+ Student.count);
		Student st3 = new Student(3,"Rohit","Mumbai");
		System.out.println("No of objects :"+ Student.count);



	}

}
