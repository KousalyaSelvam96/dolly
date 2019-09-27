package core.training;

public class Sod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=123;
		int rem=0;
		int sum=0;
		while(n>0)
		{
			rem=n%100;
			sum=sum+rem;
			n=n/10;
		}
        System.out.println(sum);
	}

}
