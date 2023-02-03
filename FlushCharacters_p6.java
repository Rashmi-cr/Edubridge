package assignment8;

import java.util.Scanner;

public class FlushCharacters_p6 {
	public static void main(String[] args) { 
		//String s1="cogniz$#45Ant"; 
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word with combination of alphabet ,number and special characters:");
		s=sc.next();
		String s1=getvalues(s); 
		System.out.println(s1); 
		} 
		public static String getvalues(String s1) { 
		StringBuffer sb= new StringBuffer(); 
		for(int i=0;i<s1.length();i++) 
		{ 
		char a=s1.charAt(i); 
		if(!Character.isAlphabetic(a)) 
		sb.append(a); 
		} 
		return sb.toString(); 
		} 
}


