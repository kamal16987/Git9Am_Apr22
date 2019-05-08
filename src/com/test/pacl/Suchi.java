package com.test.pacl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Suchi {
	public static void main(String[] args) {
	Map<Integer, String> m=new HashMap<>();
	m.put(10,"java");
	m.put(20, "sql");
	m.put(30, ".net");
	Set<Entry<Integer, String>> e = m.entrySet();
	for (Entry<Integer, String> x : e) {
		String value = x.getValue();
		Integer key = x.getKey();
		System.out.println(key);
		System.out.println(value);
		
	}
	
	
	
	

}}
