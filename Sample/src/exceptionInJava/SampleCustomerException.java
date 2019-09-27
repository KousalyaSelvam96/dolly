package exceptionInJava;

public class SampleCustomerException extends Exception {
	
	SampleCustomerException(String s)
	{
		super(s);
	}
	static void display(int age) throws SampleCustomerException
	{
		if(age<18)
		 throw new SampleCustomerException("Not eligible to vote");
		else
			System.out.println("Welcome");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	
	      display(10);
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
