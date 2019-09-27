package core.training.oopstask;

public class A3MultipleInterfaceInJava implements A1IMultipleInterface, A2MultipleInterface{

	public void implementation()
	{
		System.out.println("It has manyimplementations too");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A3MultipleInterfaceInJava a= new A3MultipleInterfaceInJava();
		a.implementation();

	}

}
