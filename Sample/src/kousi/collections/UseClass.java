package kousi.collections;

import java.util.ArrayList;

import java.util.Iterator;

public class UseClass {

	public static void main(String[] args) {
	
		StudentArraylist s1=new StudentArraylist(100, "kousi", "IT");
		StudentArraylist s2=new StudentArraylist(101, "poosh", "CSE");
		StudentArraylist s3=new StudentArraylist(102, "ishu", "CSE");
		StudentArraylist s4=new StudentArraylist(103, "priya", "ECE");
			ArrayList <StudentArraylist> al=new ArrayList <>();
				al.add(s1);
				al.add(s2);
				al.add(s3);
				al.add(s4);
				Iterator itr=al.iterator();
				while(itr.hasNext())
				{
					
						StudentArraylist sa = (StudentArraylist) itr.next();
					//System.out.println(sa.id+" "+sa.name+" "+sa.branchname);
					System.out.println(sa);

				}
				
			
				
		
		
	}

}
