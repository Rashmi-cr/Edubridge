package assignment5;
import java.util.Scanner; 
public class CkeckNoEqualsOrNot_p9 {
	public static void main(String[] args) { 
	//write a program to check whether both numbers are same or not. 
	Scanner sc =new Scanner(System.in); 
	System.out.println("Enter a number1:"); 
	int num1=sc.nextInt(); 
	System.out.println("Enter a number2:"); 
	int num2=sc.nextInt(); 
	String check=num1==num2?"numbers are equal":"numbers are not equal"; //Assignment opr
	System.out.println(check); 
	} 
	}

