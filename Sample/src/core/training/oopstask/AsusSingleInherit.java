package core.training.oopstask;

public class AsusSingleInherit extends AcerSingleInherit {
	public void performance1()
	{
		System.out.println("Good performance");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AsusSingleInherit as=new AsusSingleInherit();
		System.out.println(as.performance1(12, 20));
		as.performance1();
	}

}
