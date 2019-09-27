package kousi.collections.LinkedList;

import java.util.LinkedList;

public class LinkedListItr4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> list=new LinkedList <>();
		list.add("cat");
		list.add("dog");
		list.add("pig");
		list.add("rat");
		list.forEach((n)-> System.out.println(n));

	}

}
