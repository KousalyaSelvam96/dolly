package core.training;

public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "dolly";
		char a = name.charAt(3);
		System.out.println(a);

		String str = "Welcome to Java";
		int strLength = str.length();
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(strLength - 1));

		String str1 = "Welcome to Javatpoint portal";
		int str1Length = str1.length();
		// Fetching first character
		System.out.println("Character at 0 index is: " + str1.charAt(0));
		// The last Character is present at the string length-1 index
		System.out.println("Character at last index is: " + str1.charAt(strLength - 1));

		String str11 = "Welcome to Javatpoint portal";
		for (int i = 0; i <= str11.length() - 1; i++) {
			if (i % 2 != 0) {
				System.out.println("Char at " + i + " place " + str11.charAt(i));

			}
		}
		String d1 = "javaisalanguage";
		for (int i = 0; i <= d1.length() - 1; i++) {
			if (i % 2 != 0) {
				System.out.println("char at" + i + "place" + d1.charAt(i));
			}
		}

		String str21 = "Welcome to Javatpoint portal";
		int count = 0;
		for (int i = 0; i <= str21.length() - 1; i++) {
			if (str21.charAt(i) == 't') {
				count++;
			}
		}
		System.out.println("Frequency of t is: " + count);

		String d3 = "dolly";
		String d4 = "cateina";
		System.out.println("length is" + d3.length());

		String str31 = "Javatpoint";
		if (str31.length() > 0) {
			System.out.println("String is not empty and length is: " + str31.length());
		}
		str31 = "";
		if (str31.length() == 0) {
			System.out.println("String is empty now: " + str31.length());
		}

	}
}
