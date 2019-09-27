package kousi.collections.hashset;

import java.util.HashSet;

public class HashsetItr4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> list=new HashSet <>();
		list.add("pussy");
		list.add("meow");
		list.add("dolly");
		list.forEach((k) -> System.out.println(k));
	}

}
