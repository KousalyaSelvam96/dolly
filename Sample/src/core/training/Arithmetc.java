package core.training;

public class Arithmetc {
		static int p=0;
		public void print()
		{
			int x=10;//local
			int y=20;
			int z=x+y;
			System.out.println(z);
			
		}
		public static void main(String[] args) {
			Arithmetc o=new Arithmetc(); // instance
			o.print();
			System.out.println(p); //static

		
	}

}
