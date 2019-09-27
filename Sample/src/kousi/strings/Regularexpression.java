package kousi.strings;
import java.util.regex.*;

public class Regularexpression {

	public static void main(String[] args) {
	String s="ravisudharsan28@gmail.com";
			String[] datestart=s.split("[a-z]");
			System.out.println(datestart[13]);	
			
			String[] names=s.split("[0-9]");
			System.out.println("FullName: "+names[0]);   
			
			String[] domain=s.split("m");
			System.out.println("Dommain Name: "+domain[1]);
			
			String[] date=datestart[13].split("@");
			System.out.println("My Birth Date is: "+date[0]);
			
			String[] symbol=datestart[13].split("28");
			System.out.println("Symbol :"+symbol[1]);

			
	}
	

}
