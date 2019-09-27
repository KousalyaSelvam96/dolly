package exceptionInJava;

public class KousalyaException extends Exception{

	
	KousalyaException(String a)
	{
		super(a);
	}
	static void validate(int age) throws KousalyaException
	{
		if(age<18)
		throw new KousalyaException("Not Valid");
		else
		{
			System.out.println("Welcome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			validate(1);
			
		}
		catch(Exception e)
		{
		System.out.println(e);
			
		}
	}

}
