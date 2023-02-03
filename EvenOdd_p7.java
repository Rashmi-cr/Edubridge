package assignment5;
import java.util.Scanner; 
public class EvenOdd_p7 {
	public static void main(String[] args) { 
	// Write a program to check number is even or odd. 
	Scanner sc =new Scanner(System.in); 
	System.out.println("Enter a number:"); 
	int num=sc.nextInt(); 
	String check=num%2==0? +num+ " is even":+num+ " is odd"; //conditional operator is used to check the condition
	System.out.println(check); 
	} 
	}

