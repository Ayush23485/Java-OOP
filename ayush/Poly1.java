package ayush;


abstract class MyPar {
    protected abstract void disp();
}

class Child13 extends MyPar {
    @Override
    protected void disp() {
        System.out.println("Protected abstract method implemented");
    }
}


class AeroPlane2
{
	public void takingOff()
	{
		System.out.println("Aeroplane must takeOff in order to fly");
	}
	
	public void fly()
	{
		System.out.println("AeroPlane is flying");
	}
	
	public void landing()
	{
		System.out.println("Aeroplane is landing");
	}
}
class CargoPlane2 extends AeroPlane2
{
	public void takingOff()
	{
		System.out.println("CargoPlane requires longer runway to takeOFF");
	}
	public void fly()
	{
		System.out.println("cargoPlane is flying");
	}
	public void landing()
	{
		System.out.println("cargoplane is landing");
	}
	
}


class FighterPlane2 extends AeroPlane2
{
	public void takingOff()
	{
		System.out.println("FighterPlane requires shorter runway to takeOFF");
	}
	public void fly()
	{
		System.out.println("fighterPlane is flying");
	}
	public void landing()
	{
		System.out.println("fighterplane is landing");
	}
	
}



class PassengerPlane2 extends AeroPlane2
{
	public void takingOff()
	{
		System.out.println("PassengerPlane1 requires meidum runway to takeOFF");
	}
	public void fly()
	{
		System.out.println("PassengerPlane1 is flying");
	}
	public void landing()
	{
		System.out.println("PassengerPlane1 is landing");
	}
	
}


class Airport
{
	public void permit(AeroPlane2 aeroPlane)
	{
		aeroPlane.takingOff();//1:M
		aeroPlane.fly();
		aeroPlane.landing();
	}
}
public class Poly1
{
	public static void main(String[] args)
	{
		CargoPlane2 cp=new CargoPlane2();
		
		FighterPlane2 fp=new FighterPlane2();
		
		PassengerPlane2 pp=new PassengerPlane2();		
//		Airport a=new Airport();
//		a.permit(cp);
//		a.permit(fp);
//		a.permit(pp);
		
		Child13 ch = new Child13();
		ch.disp();

	}

}



