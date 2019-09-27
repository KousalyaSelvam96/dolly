package core.training;
import java.util.Scanner;

public class MagicNo {
	public static void main(String[] args) {
		System.out.println("Enter the Value");
		Scanner input = new Scanner(System.in);
		int inputNumber = input.nextInt();
		if (inputNumber % 9 == 1)
			System.out.println(inputNumber + " is a Magic Number");
		else
			System.out.println(inputNumber + " is NOT a Magic Number");

	}

}
