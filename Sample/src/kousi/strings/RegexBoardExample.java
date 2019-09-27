package kousi.strings;

public class RegexBoardExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="kousalyaaselvam02031996@gmail.com";
		String[] s1=s.split("[a-z + A-Z + @]");
		System.out.println("DOB :"+s1[15]);
		String[] s2=s.split("[0-9]");
		System.out.println("NAME :"+s2[0]);
		String[] s3=s.split("[@]");
		System.out.println("DOMAIN :"+s3[1]);
		String[] s4=s.split("[0-9 + a-z + A-Z]");
		System.out.println("SYMBOL :"+s4[23]);

	}

}
