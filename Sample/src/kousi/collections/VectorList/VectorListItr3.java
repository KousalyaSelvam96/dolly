package kousi.collections.VectorList;

import java.util.Iterator;
import java.util.Vector;

public class VectorListItr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <String> al=new Vector <>();

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
