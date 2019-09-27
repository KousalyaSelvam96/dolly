package core.training;

public class Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mathsMark=10;
		int scienceMark=20;
		if(mathsMark<=20 && scienceMark>=30)
		{
			System.out.println("Grade B");
		}
		else if(mathsMark>25 && scienceMark>=40)
		{
			System.out.println("Grade A");

		}
		else
		{
			System.out.println("No Grade ");

		}
	}

}
