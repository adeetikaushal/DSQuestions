package com.java.ds.misc;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class StringCode {
	
	
	public void testStringConcept() {
		
		String s ="Hello";
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		String s3 = s1;
		String s4 = s;
		String s5 ="Hello";
		String s6 ="Hello1";
 
		String test = s == s1?"true":"false";
		String eqs = s.equals(s1)?"true":"false";
		System.out.println("s == s1 " + test + " equals "+ eqs );
		
		test = s == s1?"true":"false";
		eqs = s.equals(s1)?"true":"false";
		System.out.println("s == s2 " + test + " equals "+ eqs );
		
		test = s == s3?"true":"false";
		eqs = s.equals(s3)?"true":"false";
		System.out.println("s == s3 " + test + " equals "+ eqs );
		
		test = s1 == s2?"true":"false";
		eqs = s1.equals(s2)?"true":"false";
		System.out.println("s1 == s2 " + test + " equals "+ eqs );
		
		test = s == s4?"true":"false";
		eqs = s.equals(s4)?"true":"false";
		System.out.println("s == s4 " + test + " equals "+ eqs );
		
		test = s == s5?"true":"false";
		eqs = s.equals(s5)?"true":"false";
		System.out.println("s == s5 " + test + " equals "+ eqs );
		
		test = s == s6?"true":"false";
		eqs = s.equals(s6)?"true":"false";
		System.out.println("s == s6 " + test + " equals "+ eqs );

		
	}
	/**
	 * Print Duplicate chars
	 * @param s
	 */
	
	public  void printDuplicateChars(String s) {
		char[] charArray = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for(char c :charArray) {
		 if(map.containsKey(c)) {	
			map.put(c, map.get(c)+1);
		 }else {
			map.put(c, 1);
		 }
		}
		for(Character c : map.keySet()) {
		  if(map.get(c)>1) {	
		   System.out.println("Duplicate Chars " + c + "="  + map.get(c) + " in " + s );
		  }
		}
	}
	
	/**
	 * Check if two Strings are anagrams of each other?
	 * @param args
	 */
	
	public void anagramString(String s1, String s2) {
		boolean bol = true;
		
		if(s1.length() != s2.length()) {
			System.out.println(s1 +" " + s2 + " are not amagram.");
			return;
		}
		char[] charArr = s1.toCharArray();
		for(char c : charArr) {
			if(s2.indexOf(c) < 0) {
				bol = false;
				break;
			}
		}
		if(bol)
			System.out.println(s1 +" " + s2 + " are amagram.");		
		else {
			System.out.println(s1 +" " + s2 + " are not amagram.");
		}
	}
	
	/**
	 * Print first non repeated character from String?
	 * @param args
	 */
	
	public void firstNoneRepeatedChar(String s) {
		char[] charArr = s.toCharArray();
		String subStr = null;
		for(int ii=0; ii< charArr.length; ii++) {
			subStr = s.substring(0,ii) + s.substring(ii+1);
			System.out.println("subStr = " + subStr + " charArr[ii] " +charArr[ii]  +subStr.indexOf(charArr[ii]));
			if(subStr.indexOf(charArr[ii]) < 0) {
				System.out.println("Non Repeated Char in String : " + s + " is " + charArr[ii] );
				break;
			}
		}
	}
	
	/**
	 * Reverse a given String using recursion?
	 * @param args
	 */
	
	public void reserveString(String s) {
		char[] charArray = s.toCharArray();
		System.out.print(s+ " reverse is ");
		for(int i=charArray.length-1 ;i>=0 ; i--) {
			System.out.print(charArray[i]);
		}
	}
	
	/**
	 * Check if a String contains only digits?
	 * @param args
	 */
	
	public void strContainsDigitsWithRegex(String s) {
		
		Pattern pat = Pattern.compile(".*\\d.*");
		boolean bol =pat.matcher(s).matches();
		System.out.println(s + " have digits - " +  bol);
		
		
	}
	

	/**
	 * Check if a String contains only digits? with regex
	 * @param args
	 */
	
	public void strContainsDigitsWithoutRegex(String s) {
		
		char[] charArray = s.toCharArray();
		int i =-1;
		boolean found= false;
		for(char c: charArray) {
			i = Character.getNumericValue(c);
			if(i < 10 && i >= 0) {
				found =true;
				break;
			}
		  } 	
			if(found) {
				System.out.println(s + " contains digits");
			}else {
				System.out.println( s + " doesnt digits");
			}
		
	}
	
	/**
	 * Count a number of vowels and consonants in a given String?
	 * @param args
	 */
	
	public void countVowelAndConsonants(String str) {
		char[] charArray = str.toCharArray();
		int countV =0;
		
		for(char c: charArray) {
			if(c=='a' || c=='e' || c=='i' || c=='o' || c == 'u') {
				countV++;
			}
		}
		int cons = str.length()-countV;
		System.out.println("Total volwels " + countV + " consonants " + cons);
		
	}
	
	/**
	 * Check if given String is Palindrome?
	 * @param args
	 */
	
	public void isPalindrome(String str) {
		boolean found = true;
		char[] charArr = str.toCharArray();
		StringBuilder sb= new StringBuilder();
		for(int jj= charArr.length-1; jj>=0; jj--) {
			sb.append(charArr[jj]);
		 }
			if(str.equalsIgnoreCase(sb.toString()))
				System.out.println(str + " is Palindrome");
			else
				System.out.println(str + " is not Palindrome");
		
	}
	
	/**
	 * Check if two String is a rotation of each other
	 *  * @param args
	 */
	
	public void isStrRotation(String str, String rotation) {
		String concat = str+str;
		if(concat.contains(rotation)) {
			System.out.println(str + " is rotation of " + rotation);
		}else {
			System.out.println(str + " is not rotation of " + rotation);
		}
	}
	
	/**
	 * Pangram string
	 */
	
	public void isPangram(String str) {
		
		String toLowerStr = str.toLowerCase();
		boolean[] mark = new boolean[26];
        int index = 0;
        
		for(int ii=0; ii<toLowerStr.length(); ii++) {
			if(toLowerStr.charAt(ii) >= 'a' && toLowerStr.charAt(ii) <= 'z' ) {
				index = str.charAt(ii) - 'a';
				mark[index] = true;
			}
		}
		boolean found =true;
		for(int ii=0; ii<25; ii++) {
			if(mark[ii] == false) {
				found=false;
				break;
			}
		}
		
		if(found)
			System.out.println(str + " is  pangram");
		else
			System.out.println(str + " is not pangram");
		
	}
	
	
	/**
	 * String is Pangrammatic Lipogram
	 */
	
	public void isStrPangrammatic(String str) {
		
		String s = str.toLowerCase();
		int index =-1;
		boolean[] mark = new boolean[26];		
		for( int ii=0; ii<s.length() ; ii++) {
			if(s.charAt(ii) >='a' && s.charAt(ii) <='z') {
				index = s.charAt(ii)-'a';
				mark[index] = true;
			}
		}
		int count =0;
		for(int ii=0;ii<mark.length;ii++) {
			if(mark[ii] == false) {
				count++;
			}
		}
		if(count == 0 ) {
			System.out.println(str + " is Pangram");
		}else if(count == 1) {
			System.out.println(str + " is Pangrammatic");
		}else {
			System.out.println(str + " is Lipogram");
		}
		
	}
	
	
	/**
	 * Program to find the initials of a name.
	 */
	
	public void findInitialsInName(String name) {
		System.out.print("Initial of "+ name +" - ");
		String[] nameSplit = name.split(" ");
		for(int ii=0;ii<nameSplit.length; ii++) {
			System.out.print(nameSplit[ii].substring(0,1).toUpperCase() + " " );
		}
	}
	
	/**
	 * Check the number is Duck number
	 */
	
	public void isDuckNumber(String numb) {
		boolean zerosPresent=false;
		
		if(numb.charAt(0)=='0') {
			System.out.println(numb +" is not a Duck number");		
			return;
		}else {
			for(int ii=0; ii < numb.length(); ii++) {
				if(numb.charAt(ii) == '0') {
					zerosPresent=true;
					break;
				}
			}
		}
		if(zerosPresent)
			System.out.println(numb +" is a Duck number");
		else
			System.out.println(numb +" is not a Duck number");
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		StringCode code = new StringCode();
		
		code.testStringConcept();
		code.printDuplicateChars("Johnny");
		code.anagramString("maydptr", "amydpta");
		code.anagramString("maydptr", "amydptr");
		code.firstNoneRepeatedChar("aaddettii");
		code.reserveString("johnny");
		System.out.println("");
		code.strContainsDigitsWithRegex("johnny");
		code.strContainsDigitsWithRegex("johnny12");
		code.strContainsDigitsWithoutRegex("johnny");
		code.strContainsDigitsWithoutRegex("johnny12");
		code.countVowelAndConsonants("Testao");
		code.isPalindrome("abcdcba");
		code.isPalindrome("abcdcbad");
		code.isStrRotation("IndiaVsEngland", "EnglandIndiaVs");
		code.isStrRotation("IndiaVsEngland", "EnglandVsIndia");
		code.isPangram("this is a gitrl");
		code.isPangram("abcdefghijklmnopqrstuvwxyz");
		
		code.isStrPangrammatic("abcdefghijklmnopqrstuvwxyz");
		code.isStrPangrammatic("abcdefghijklmnopqrstuvwxy");
		code.isStrPangrammatic("abcdefghijklmnopqrstuvwx");
	
		code.findInitialsInName("John Adam Smith Jr");
		System.out.println("");
		code.findInitialsInName("John adam smith Jr");
		System.out.println("");
		code.isDuckNumber("10233");
		code.isDuckNumber("010233");
		code.isDuckNumber("1233");
		code.isDuckNumber("1000233");
		code.isDuckNumber("01000233");

	}
	

}
