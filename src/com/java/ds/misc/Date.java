package com.java.ds.misc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Date {

	public static void main(String[] args) {
		
		File file = new File("/Users/akaush1/Desktop/test.txt"); 
		File file1 = new File("/Users/akaush1/Desktop/test1.txt"); 
		  
		  BufferedReader br;
		  BufferedWriter writer;
		try {
			br = new BufferedReader(new FileReader(file));
			writer = new BufferedWriter(new FileWriter(file1));
		
		  
		  String st; 
		  String[] splited = new String[7];
		  Map hashMap = new HashMap<String, String>();
		  Set <String> tree = new HashSet();
		  while ((st = br.readLine()) != null) {
			  splited = st.split(" ");
			  hashMap.put(splited[0], splited[3]);
		  }
		  tree = hashMap.keySet();
		  for(String s : tree) {
			  writer.append(hashMap.get(s)+"");
			  writer.append("\n");
			  System.out.println(hashMap.get(s));
		  }
		  writer.close();   
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 

	}

}
