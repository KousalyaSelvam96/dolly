package kousi.collections.mapset;

import java.util.HashMap;

import java.util.Map;

public class MapSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> al=new HashMap <Integer,String>();
		al.put(1, "kousi");
		al.put(2, "dolly");
		al.put(3, "pussy");
		al.remove(1);
		System.out.println(al);


	}

}
