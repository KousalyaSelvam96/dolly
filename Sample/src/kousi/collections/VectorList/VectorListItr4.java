package kousi.collections.VectorList;

import java.util.Vector;

public class VectorListItr4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <String> list=new Vector <>();

		list.add("cat");
		list.add("dog");
		list.add("pig");
		list.add("rat");
		list.forEach((n)-> System.out.println(n));

	}

}
