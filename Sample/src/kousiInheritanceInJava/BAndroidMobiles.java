package kousiInheritanceInJava;

public class BAndroidMobiles extends AndroidMobiles{
	
	void design()
	{
		System.out.println("It has good sleek design");
	}

	public static void main(String[] args) {
		
		BAndroidMobiles a=new BAndroidMobiles();
		a.design();
		a.display();
				

	}

}
