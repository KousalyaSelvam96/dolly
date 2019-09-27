package otherPrograms;

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 15;
		/*
		 * Cookies taste=new Cookies() { public void goodDay() {
		 * System.out.println(size); } }; taste.goodDay();
		 */
		Cookies taste = () ->

		{
			System.out.println(size);
		};

		taste.goodDay();

	}

}