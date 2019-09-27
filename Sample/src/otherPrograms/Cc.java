package otherPrograms;

public class Cc extends MultipleInt implements Bbb{
	
	public void car()
	{
		System.out.println("unimplementing car");
	}
	void car1()
	{
		System.out.println("it is second car");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cc c=new Cc();
		c.bike();
		c.car();
		c.car1();
	}

}
