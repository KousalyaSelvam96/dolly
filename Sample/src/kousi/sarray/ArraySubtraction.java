package kousi.sarray;

public class ArraySubtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] value=new int[5];
	long values[]= {1,2,3,4,5};
	long total=0;
	for(int i=0;i<=values.length-1;i++)
	{
		total=total-values[i];
	}
	System.out.println(total);

	}

}
