package core.training.oopstask;

public class Zrankusingaggre {

	String sex;
	long mno;
	ZAddressAggre marks;
	
	Zrankusingaggre(String s, long m, ZAddressAggre ma)
	{
		this.sex=s;
		this.mno=m;
		this.marks=ma;
	}
	
	void display()
	{
		System.out.println(sex+" "+mno);
		System.out.println(marks.rollno+" "+marks.name+" "+marks.marks);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		
		ZAddressAggre x=new ZAddressAggre(101,"kousi",200);
		Zrankusingaggre y=new Zrankusingaggre("Female",7401615930l,x);
		
		y.display();
		

	}

}
q