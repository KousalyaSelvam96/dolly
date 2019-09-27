package exceptionInJava;

public class CustomerExp extends Exception {
	
	
	CustomerExp(String s)
	{
		super(s);
	}
	
	static void check(int n) throws CustomerExp
	{
		if(n>20)
		throw new CustomerExp(" valid");
		
		
		else
		{
			System.out.println("not valid");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			check(100);
		}
		catch(Exception f)
		{
			System.out.println(f);
		}
		finally
		{
			System.out.println("the code was verified successfully");
		}
	}

}
