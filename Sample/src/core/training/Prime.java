package core.training;

public class Prime {
	public static void main(String args[]) {
		int n=35;
		boolean a=true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				a=false;
				break;
			}
			
		}
		
		if(a)
		{
			System.out.println(n+ " Prime number ");
		}
		else
		{	System.out.println("Not a Prime number");

		}
		
	}

}
