package com.java.ds.stackqueue;

/**
 * Balanced parenthesess
 * Infix to Postfix
 * Towers of Hanoi  - In a party of N people, each person will shake her/his hand with each other person only once. On total how many hand-shakes would happen?
   * 	2(power of n)-1 (n-1) -> 2-1, n-2 -> 2*2-1 
 * 
 * @author akaush1
 *
 */
public class Stack {

	char[] charArr = new char[100];
	
	//----Using Stack-------
	int top = -1;

	boolean isEmpty() {
		return top == -1?true:false;
	}
	char pop() {
		char x = 0;
		if (top == -1) {
			System.out.println("Stack is empty");
		} else {
			x = charArr[top];
			top--;
		}
		return x;
	}
	void push(char x) {

		if (top == 99) {
			System.out.println("Stack is full");
		} else {
			charArr[++top] = x;
		}
	}

	boolean matchChar(char c, char adding) {
		if (c == adding) {
			return true;
		} else {
			return false;
		}
	}
	
	//----------

	/*
	 * Using for loop
	 */

	int v1 = 0;
	int v2 = 0;
	int v3 = 0;
	int v4 = 0;

	private void count(char character) {
		if(character=='(') {
			v1=v1+1;
		}else if(character==')') {
			v1=v1-1;
		}else if(character=='{') {
			v1=v1+1;
		}else if(character=='}') {
			v1=v1-1;
		}else if(character=='[') {
			v1=v1+1;
		}else if(character==']') {
			v1=v1-1;
		}else {
			v4++;
		}
	}
	// ----------Java implementation to convert infix expression to postfix----
	
	
	static int Prec(char ch)
    {
        switch (ch)
        {
        case '+':
        case '-':
            return 1;
      
        case '*':
        case '/':
            return 2;
      
        case '^':
            return 3;
        }
        return -1;
    }
	
	
	
	// ---------end-----
	
	
	public static void main(String[] args) {

		Stack s = new Stack();
		boolean isMatch=false;
		//String sting = "{}[]()())))([][]{}{{}";
		String sting = "{}[]()()()[][][{}{}]";


		for (int ii = 0; ii < sting.length(); ii++) {
			s.count(sting.charAt(ii));
		}
		System.out.println(s.v1 + s.v2 + s.v3 + s.v4 == 0 ? "String is balanced" : "not balanced");

		// Using stack
		for (int ii = 0; ii < sting.length(); ii++) {
			if (sting.charAt(ii) == '(' || sting.charAt(ii) == '{' || sting.charAt(ii) == '[') {
				s.push(sting.charAt(ii));
			} else if (sting.charAt(ii) == ')' || sting.charAt(ii) == '}' || sting.charAt(ii) == ']') {
				char matchingChar = s.pop();
			    isMatch = s.matchChar(matchingChar, sting.charAt(ii));
			}
		}
		System.out.println(s.isEmpty() ? "String is balanced" : "not balanced");
	}
}
