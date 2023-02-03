package assignment8;

import java.util.Scanner;

public class Combo_p4 {
	public static void main(String[] args) {
	UserMainCode3 u = new UserMainCode3();
	String y =u.getCombo();
	System.out.println(y);
	}
	}
	class UserMainCode3
	{
	String getCombo()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first string");
	String s1=sc.next();
	System.out.println("Enter second string");
	String s2=sc.next();
	int count1 = 0;
	int count2 = 0;
	String sim;
	if(s1.length()>s2.length()) {
	sim= s1+s2+s1;
	}
	else {
	sim =s2+s1+s2;
	}
	return sim;
	}
	}

