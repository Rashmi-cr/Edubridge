package assignment4;
import java.util.Scanner;
public class Factorial_p4 {

	public static void main(String[] args) 
	//program to find the factorial value of any number entered through the keyboard. 
	{
		int i = 1, num; 
		int fact = 1;
		Scanner sc = new Scanner(System.in);		
		System.out.println(" Please Enter any number : ");
		num = sc.nextInt();
		while (i <= num)  {
			fact = fact * i; // to calculate factorial of a number
			i++;
		}
		System.out.println(" The factorial of "+num+" is "+fact);
	}
}