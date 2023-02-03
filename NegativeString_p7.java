package assignment8;
import java.util.Scanner;
public class NegativeString_p7 {	
	public static void main(String[] args) {
	UserMainCode6 s= new UserMainCode6(); 
	String y = s.negativeString();
	System.out.print(y);
	}
	}
	class UserMainCode6{
	String negativeString() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a posistive sentence including a keyword 'is' ");
	String s = sc.nextLine();
	String s1 = s.replaceAll("is", "is not");
	return s1;
	}
	}	

/*  i/p :this is a program
	o/p :this not is not a program */