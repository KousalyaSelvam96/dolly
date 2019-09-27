package kousi.strings;

public class Regexinjavaprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="kousalyaaselvam1996@gmail.com";
		//String s="kumuas1394@gmail.com";
		String[] s1=s.split("[@]");
		s1[0]="kousalyaaselvam1996";
		s1[1]="gmail.com";
		String[] s2=s1[0].split("[0-9]");
		String[] s3=s1[0].split("[0-9]");
		for(int i=0;i<s2.length;i++)
		{
			System.out.println(i+"index"+s2[i]);
		}
		System.out.println("first name:"+s2[0].substring(0,1));
		System.out.println("last name:"+s2[0].substring(4,5));
		System.out.println("Domain:"+s1[1]);
		System.out.println("year"+s1[0]);
		
	}

}
