package otherPrograms;

interface Aa
{
	void show();
}
/*
class Xy implements Aa
{
	public void show()
	{
		System.out.println("hello");
	}
}*/

public class LambaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**Aa obj;
		obj=new Xy();
		obj.show();*/
		
		obj=(i) -> System.out.println("hello");
	
}
}
