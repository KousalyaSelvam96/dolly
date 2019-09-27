package core.training;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=18;
int weight=18;
if(age>=18)
{
	if(weight>=20)
	{
		System.out.println("Eligible to donate blood");
	}
	else
		{
		System.out.println("Under weight");
		}
	}
else
{
	System.out.println("Under age");

}
	}

}
