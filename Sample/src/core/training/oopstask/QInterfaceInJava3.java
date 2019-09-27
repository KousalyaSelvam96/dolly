package core.training.oopstask;

public class QInterfaceInJava3 extends QInterfaceInJava2{

	public void show1()
	{
		System.out.println("this is second show method");
	}
	
	public void show2()
	{
		System.out.println("this is third show method");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QInterfaceInJava3 s=new QInterfaceInJava3();
		s.show();
		s.show1();
		s.show2();

	}

}
