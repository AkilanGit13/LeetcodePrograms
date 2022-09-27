package com.akil.leetCode;

import java.util.Stack;

public class BackspaceStringCompare {
	public static String stackOperation(String s) {
		var st = new Stack<>() ;
		
		for (int i = 0; i < s.length(); i++) {
			if(!(s.charAt(i)+ "").equals("#")) {
				st.push(s.charAt(i)+ "") ;
			}// in below line first condition is optional
			else if((s.charAt(i) + "").equals("#") && !st.isEmpty()){
				st.pop() ;
			}
			
		}
		System.out.println(st);
		s = st.toString() ;
		
		return s.replaceAll("\\W", "");
		
	}
	
	public static void main(String[] args) {
		String s = "a##c", t = "#a#c" ;		
		
		s = BackspaceStringCompare.stackOperation(s) ;
		System.out.println(s) ;
		t = BackspaceStringCompare.stackOperation(t) ;
		System.out.println(t) ;
		System.out.println(s.equals(t));
	}

}
