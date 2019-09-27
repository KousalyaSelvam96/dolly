package kousi.strings;

public class Regexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="kousalyaaselvam1996@gmail.com";
		String[] datestart=s.split("[a-z,"
				+ ""
				+ ""
				+ "@]");
		System.out.println("DOB:"+datestart[15]);	
		String[] name=s.split("[0-9]");
		System.out.println("Name: "+name[0]);
		String[] domain=s.split("[@]");
		System.out.println("Domain: "+domain[1]);
		String[] Symbol=s.split("[0-9 a-z]");
		System.out.println("Symbol: "+Symbol[19]);		
	}

}


