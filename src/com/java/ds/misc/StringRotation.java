package com.java.ds.misc;

import java.util.StringTokenizer;
import java.util.stream.IntStream;

class StringRotation
{
    /* Function checks if passed strings (str1 and str2)
       are rotations of each other */
    static boolean areRotations(String str1, String str2)
    {
        // There lengths must be same and str2 must be 
        // a substring of str1 concatenated with str1.  
        return (str1.length() == str2.length()) &&
               ((str1 + str1).indexOf(str2) != -1);
    }
     
    // Driver method
    public static void main (String[] args)
    {
        String str1 = "AACD";
        String str2 = "ACDA";
 
        if (areRotations(str1, str2))
            System.out.println("Strings are rotations of each other");
        else
            System.out.printf("Strings are not rotations of each other");
        
        
        String s = "This is #a #wonderful day ## #^#$@$ in this #month";
        StringTokenizer token = new StringTokenizer(s, " ");
        String a2;
        while(token.hasMoreTokens()) {
        	 String a1 = token.nextToken();
	        	if(a1.startsWith("#") ) {
	        		//System.out.println("---bb-" + a1 );
	        		a2 = a1.substring(1,a1.length());
	        		if(a2.indexOf('#') <= -1) {
	        			System.out.println("----" + a1 );
	        		}
	        		

	        	}
      }
        
        
    }
}