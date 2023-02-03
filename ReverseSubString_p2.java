package assignment8;

import java.util.Scanner;

public class ReverseSubString_p2 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s;
	int stringIndex,len;
	System.out.println("Enter a string");
	s = sc.next();
	System.out.println("Enter starting index");
	stringIndex=sc.nextInt();
	System.out.println("Enter length");
	len=sc.nextInt();
	UserMainCode1 u = new UserMainCode1();
	String sim = u.reverseSubstring(s,stringIndex,len);
	System.out.println(sim);
	}
	}
	class UserMainCode1 {
	public String reverseSubstring(String s,int stringIndex,int len) {
	StringBuilder st = new StringBuilder();
	st.append(s);
	st.reverse();
	String sim = st.substring(stringIndex,stringIndex+len);
	return sim;
	}
	}

