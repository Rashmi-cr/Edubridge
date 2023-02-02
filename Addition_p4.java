package assignment2;
import java.util.Scanner;
public class Addition_p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	8.Write a program to do addition 5 number
		int num1,num2,num3,num4,num5 ; 
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter first number:"); 
		num1=scanner.nextInt(); 
		System.out.println("Enter second number:"); 
		num2=scanner.nextInt(); 
		System.out.println("Enter third number:"); 
		num3=scanner.nextInt(); 
		System.out.println("Enter fourth number:"); 
		num4=scanner.nextInt(); 
		System.out.println("Enter fifth number:"); 
		num5=scanner.nextInt(); 
		//adding all 5 numbers and storing result in add which is of type int
		int add = num1+num2+num3+num4+num5; 
		System.out.println("The sum of this 5 numbers is: " + add);
		}

	}

