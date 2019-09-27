package kousi.strings;

public class Stringmethodsinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s1="Java is a programming language";
	//charAt RETURN CHAR VALUE FOR A PARTICULAR INDEX
	System.out.println(s1.charAt(8));
	//length() RETURNS STRING LENGTH
	System.out.println(s1.length());
	//STRING FORMAT returns a formatted string
	String s01 = String.format("%s",s1);
	System.out.println(s01);
	String s02 = String.format("%a",12.456);
	System.out.println(s02);
	String s03 = String.format("%b","null");
	System.out.println(s03);
	String s04 = String.format("%c",'a');
	System.out.println(s04);
	String s05 = String.format("%d",1234567);
	System.out.println(s05);
	String s06 = String.format("%e",0.0001999);
	System.out.println(s06);
	String s07 = String.format("%f",5.678);
	System.out.println(s07);
	String s2 = String.format("name %s","kousalya");
	System.out.println(s2);
	
	
	
	
	}

}
