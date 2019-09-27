package kousi.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListItr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> al=new ArrayList <>();
			al.add("qwerty");
			al.add("ascii");
			al.add("keyboard");
			al.add("mouse");
			al.add("monitor");
		 	Iterator itr=al.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
	}

}
