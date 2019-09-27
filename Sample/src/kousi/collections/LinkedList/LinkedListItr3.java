package kousi.collections.LinkedList;

import java.util.Iterator;

import java.util.LinkedList;

public class LinkedListItr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> aa=new LinkedList <>();
			aa.add("aaa");
			aa.add("bbb");
			aa.add("ccc");
			Iterator itr=aa.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			
			
	}

}
