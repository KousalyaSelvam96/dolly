package core.training;

public class Sample {
	static int count=0;
	int c=0;

	public static void inc()
	{
	count++;
	System.out.println(count);
	}

	public void inc1()
	{
	c++;
	System.out.println(c);
	}

	public static void main(String args[])
	{
	Sample c1=new Sample();
	Sample c2=new Sample();
	Sample c3=new Sample();
	
	
	c1.inc();
	c2.inc();
	c3.inc();

	c1.inc1();
	c2.inc1();
	c3.inc1();
	}
}
