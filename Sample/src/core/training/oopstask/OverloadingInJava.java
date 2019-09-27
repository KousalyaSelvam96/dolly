package core.training.oopstask;

public class OverloadingInJava {
	
	public void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	public void sum1(int a, int b)
	{
		System.out.println(a+b);
	}	
	public float show(float a)
	{
		return a;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingInJava q=new OverloadingInJava();
		q.sum(10, 20);
		q.sum1(30, 20);
		System.out.println(q.show(12));
	}

}
