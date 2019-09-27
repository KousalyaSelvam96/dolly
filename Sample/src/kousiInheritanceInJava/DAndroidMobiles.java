package kousiInheritanceInJava;

public class DAndroidMobiles extends CAndroidMobiles {

		void camera()
		{
			System.out.println("It has good front and back camera");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DAndroidMobiles b=new DAndroidMobiles();
		b.camera();
		b.features();
		b.design();
		b.display();

	}

}
