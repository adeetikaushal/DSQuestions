package com.java.ds.misc;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class TestStringManuplation {
	
	public static void main(String[] arg) {
		
		
		String val = "Adeeti Kaushal";
		
		List<String> list = new ArrayList();
		list.add("A1");
		list.add("A2");
		list.add("A3");
		list.add("A4");
		list.add("A5");
		
		StringJoiner join = new StringJoiner(" ");
		join.add(list.get(0)).add(list.get(1)).add(list.get(2)).add(list.get(3));
		
		StringJoiner join1 = new StringJoiner(" ");
		join1.add(list.get(0)).add(list.get(1)).add(list.get(2)).add(list.get(3));
		
		StringJoiner j= join.merge(join1);
		
		System.out.println(j.toString());
		
	}

}
