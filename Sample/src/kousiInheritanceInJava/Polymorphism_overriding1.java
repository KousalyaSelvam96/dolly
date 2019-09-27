package kousiInheritanceInJava;

public class Polymorphism_overriding1 extends Polymorphism_overriding{
	
	void values(int a, int b)
	{
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism_overriding1 z=new Polymorphism_overriding1();
		z.values(10, 20);
		
	}

}
