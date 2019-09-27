package kousiInheritanceInJava;

public class FAndroidMobiles extends AndroidMobiles{
	 void functionality()
	 {
		 System.out.println("It has latest bluetooth and wifi connectivity");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FAndroidMobiles c=new FAndroidMobiles();
		c.functionality();
		c.display();
	}

}
