
public class EncapsulationInJava {
	
	private int rollno;
	private String name;
	private float marks;
	
	public void setRollno(int rollno)
	{
		this.rollno=rollno;
	}
	public int getRollno()
	{
		return rollno;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setMarks(float marks)
	{
		this.marks=marks;
	}
	public float getMarks()
	{
		return marks;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EncapsulationInJava a=new EncapsulationInJava();
		a.setRollno(123);
		a.setName("Kousalya");
		a.setMarks(395.5f);
		System.out.println(a.getRollno()+"\n"+a.getName()+"\n"+a.getMarks());
		
		
		
	}

}
