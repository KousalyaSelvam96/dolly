package kousi.collections;

public class StudentArraylist {
	
	int id;
	String name;
	String branchname;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id +" "+ name +" "+ branchname;
	}
	StudentArraylist(int id, String name, String branchname)
	{
		this.id=id;
		this.name=name;
		this.branchname=branchname;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
