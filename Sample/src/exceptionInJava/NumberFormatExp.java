package exceptionInJava;

public class NumberFormatExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String s="12345";
			 int d=Integer.parseInt(s);
			 System.out.println(d);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Atlast the code is executed");
		}

	}

}
