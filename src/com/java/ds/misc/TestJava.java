package com.java.ds.misc;

import java.io.IOException;
import java.util.Optional;
import java.util.stream.Stream;

public class TestJava {
	
	
	
	
	public void fun()  {
		
		int[] a = {1,2,3,4,5};
		
		for(int ii=0; ii<a.length; ii++) {
			for(int jj=ii+1; jj<a.length; jj++) {
				
				if(a[ii] == a[jj]) {
					System.out.println("First duplicate  " +  a[ii] + " : " + a[jj] );
				}
			}
		}
		
	}
	
public void fun1(int m, int n, int a[][])  {
//		int ii =0 , jj = 0;
//		while(ii <= row) {
//			while(jj <= col) {
//				System.out.print(a[ii][jj] + " ");
//				if(jj == col) {
//					System.out.println("1111");
//				  while(ii < row) {	
//					jj = col;
//					System.out.print(a[ii][jj] + " ");
//					ii++;
//				  }
//				}else if (jj < row){
//					jj++;
//				}
//			}				
//		}
	int i=0, k = 0, l = 0;
	while (i < m && l < n)
    {
        // Print the first row from the remaining rows
        for (i = l; i < n; ++i)
        {
            System.out.print(a[k][i]+" ");
        }
        k++;

        // Print the last column from the remaining columns 
        for (i = k; i < m; ++i)
        {
            System.out.print(a[i][n-1]+" ");
        }
        n--;

        // Print the last row from the remaining rows */
        if ( k < m)
        {
            for (i = n-1; i >= l; --i)
            {
                System.out.print(a[m-1][i]+" ");
            }
            m--;
        }

        // Print the first column from the remaining columns */
        if (l < n)
        {
            for (i = m-1; i >= k; --i)
            {
                System.out.print(a[i][l]+" ");
            }
            l++;    
        }        
    }
}



		
	
    public void fun(String a) {
    	int itr=0;
    	while(itr < 7) {
    		
    	for(int ii=0;ii<=itr;ii++) {
    	 if(itr%2==0) {	
    	  System.out.print("*" +" ");	
    	 }
    	}
    	System.out.print("\n");	
    	itr++;
    	
    	}
		
	}
    
   public int fun(String a, int aa) {
	   return 1;
	}
   
	
	private String getStringValue1() {
		System.out.println("Get string value: ");
		return "getStringValue";
	}
	
	public static  String getStringValue2() {
		System.out.println("Get string value: ");
		return "getStringValue";
	}
	
	public static void main(String[] a) {
		
	
		TestJava java = new TestJava();
		java.testFun();
		java.fun();
		
		int R = 3;
        int C = 5;
        
        int h[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        
        java.fun1(R,C,h);
        System.out.println("----fun--\n");
        java.fun("g");
        
        abc();
        System.out.println("fib ");
        int index = 1;
         while (index < 10 ) {
            System.out.print(fib(index) + " ");
            index ++;
        }
         
         System.out.println("test 128:  " + prime(128) );
         System.out.println("test 71:  " + prime(71) );
         
         System.out.println("PAl "+pali("ABCDCBA"));
         
         System.out.println("Cube " + Math.pow(5, 3));
         
        	 System.out.println("fac  " + fac(5));
        	 
        	 System.out.println("Anagram : " + anagram("ARMY", "MARD"));
        	 
		
	}
	public static boolean anagram(String s,  String s2) {
		
		boolean bol = true;
		if(s.length() != s2.length()) {
			return false;
		}else {
			
			char[] ss1 = s.toCharArray();
			char[] ss2 = s2.toCharArray();
			
			for(char c:ss1) {
				System.out.println(s2.indexOf(c));
				if(s2.indexOf(c) < 0) {
					bol = false;
				}
				
			}
			
		}
		return bol;
	}
	
	public static int fac(int i) {
		
		if(i == 1) {
			return 1;
		}
		return i*fac(i-1);
		
	}

	
	
	public static int fib(int i) {	
		if(i == 1 || i == 2) {
		  return 1;
		}
		return fib(i-1) + fib(i-2);  
		
	}
	
	public static boolean prime(int i) {	
		if (i==1) {
			return true;
		}else if(i ==2) {
			return true;
		}else if(i==3) {
			return true;
		}else if((i*i-1)%24 ==0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static boolean pali(String a) {
		
		Stream s = Stream.of(a);
		StringBuffer b = new StringBuffer(a);
		b.reverse();
		boolean bol = s.allMatch(p -> a.equalsIgnoreCase(b.toString()) );
		return bol;
	}
	
	
	
	private static void abc() {
		int[] ii = {1,2,7,8};
		
		int[] newa = new int[ii.length];
		int prod = 1;
		for(int main = 0; main<ii.length ; main++) {
			for(int iii = main+1; iii<ii.length ; iii++) {
			 prod = prod * ii[iii];
		    }
		  newa[main]=prod;
		  System.out.println(prod);
		  prod=1;
		  }
		  System.out.println("ppp   "+newa);
	}
	
	
	private static void cube() {
		
	}

	
	
	private static void testFun() {
		Optional<String> string = Optional.empty();
		System.out.println("String : empty : " + string);

		TestJava java = new TestJava();

		
		Optional<String> string1 = Optional.of("test");
		System.out.println("String : empty : " + string1);
		
		
		Optional<String> string2 = Optional.ofNullable(null);
		System.out.println("String : empty : " + string2);
		
		
		Optional<String> string3 = Optional.ofNullable("test");
		System.out.println("String : empty : " + string3);
		
		System.out.println("String : empty orElse------------------------------- ");

		
		String string4 = Optional.ofNullable("test").orElse("othervalue");
		System.out.println("String : empty : " + string4);
		
		
		String string5 = (String) Optional.ofNullable(null).orElse("passnull");
		System.out.println("String : empty : " + string5);
		
		
		String string6 = Optional.ofNullable("test").orElse(java.getStringValue1());
		System.out.println("String : empty test: " + string6);
		
		String string7 = (String) Optional.ofNullable(null).orElse(java.getStringValue1());
		System.out.println("String : empty empty: " + string7);
//		
//		String string8 = Optional.ofNullable("test").orElseGet("othervalue");
//		System.out.println("String : empty : " + string8);
//		
//		
//		String string9 = (String) Optional.ofNullable(null).orElseGet("passnull");
//		System.out.println("String : empty : " + string9);
//		
		System.out.println("-----------String : empty orElseGet ----------");

		
		String string10 = Optional.ofNullable("test").orElseGet(TestJava::getStringValue2);
		System.out.println("String : empty : " + string10);
		
		String string11 = (String) Optional.ofNullable(null).orElseGet(TestJava::getStringValue2);
		System.out.println("String : empty : " + string11);
	}
	
}
