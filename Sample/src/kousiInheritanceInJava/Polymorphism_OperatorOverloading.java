package kousiInheritanceInJava;

public class Polymorphism_OperatorOverloading {
	
	int mech(int a, int b)
	{

		return a+b;	
		
	}
	
	int subjects(int a, int b, int c)
	{
		
		return	a+b+c;
		}
	int subjects(int a, int b, int c, int d)
	{
		return a+b+c+d;
	}
	int subjects(int a)
	{
		return a;
	}
	int subjects1(int a, int b, int c, int d)
	{
		return a;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism_OperatorOverloading x=new Polymorphism_OperatorOverloading();
		Polymorphism_OperatorOverloading x1=new Polymorphism_OperatorOverloading();
		System.out.println(x1.subjects(10,20,30,40));
		System.out.println(x.subjects(1,2,3,4));
		System.out.println(x.subjects(1));
		System.out.println(x.mech(1,2));
		System.out.println(x.subjects(1,2,3));


	}

	}

