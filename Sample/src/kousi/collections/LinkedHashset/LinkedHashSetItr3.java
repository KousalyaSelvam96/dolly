package kousi.collections.LinkedHashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetItr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet <String> al=new LinkedHashSet <>();
		al.add("kartz");
		al.add("ishu");
		al.add("mohana");
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
