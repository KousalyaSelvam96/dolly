package kousi.collections.hashset;

import java.util.HashSet;

import java.util.Iterator;

public class HashsetItr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> list=new HashSet <>();
		list.add("pussy");
		list.add("meow");
		list.add("dolly");
		list.add("dolly");

		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
