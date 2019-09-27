package core.training.oopstask;

public class PAbstract1 extends PAbstractClass{
	
	 void show()
	{
	System.out.println("show method");	
	}
	 

	 void display()
		{
		System.out.println("display method");	
		}
	 
	 void console()
		{
		System.out.println("console method");	
		}
		 
		 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PAbstract1 a=new PAbstract1();
		a.console();
		a.show();
		a.display();
	}

}
