package kousi.collections;

import java.util.ArrayList;

public class ArrayListItr4 {
	
	public static void main(String[] args)
	{
		ArrayList <String> list=new ArrayList <>();
		list.add("cat");
		list.add("dog");
		list.add("pig");
		list.add("rat");
		list.forEach((n)-> System.out.println(n));
	
	}
}
