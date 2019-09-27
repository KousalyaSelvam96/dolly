package kousi.strings;

public class Regrexusingsplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      //Splitting colon separated String in Java
	      /*
	      String[] strings = colon.split(":");
	     
	      System.out.println("Original Colon Separated String : " + colon);
	      System.out.println("String splitted using Split() method of java.lang.String in Java");
	     
	      for(String str : strings){
	          System.out.println(str);
	          */
	          	    
	      String don="www.amazon.com";
	      String[] str01=don.split("[.]");
	      System.out.println(don);
	      for(String str02:str01)
	      {
	    	  System.out.println(str02);
	      }
	      
	      
	      String colon = "Java:J2EE:JavaFX:JavaME";
	      String[] strings = colon.split(":");
	      System.out.println(colon); 
	      for(int i=0;i<strings.length;i++) {
	    	  System.out.println(strings[i]);
	      }
	      /*
	      for(String str : strings){
	      System.out.println(str);
	      }*/
	      
	      
	      String s12="apple,orange,banana,pineapple";
	      String s13[]=s12.split(",");
	      System.out.println(s12);
	      for(String s14:s13)
	      {
	    	  System.out.println(s14);
	      }

	}}