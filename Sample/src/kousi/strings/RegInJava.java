package kousi.strings;

public class RegInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="rajasekarselvam1991@gmail.com";
		String[] s1=s.split("[@]");
		s1[0]="Rajasekarselvam1991";
		s1[1]="gmail.com";
		String[] s2=s1[0].split("[0-9]");
		String[] s3=s1[1].split("[0-9]");
		System.out.println("Name  :"+s2[0]);
		for(int i=0;i<s3.length;i++)
		{
			System.out.println("Domain :"+s3[i]);
		}
		String[] s4=s1[0].split("[a-z]");
		System.out.println("Year :"+s4[16]);
	}

}
