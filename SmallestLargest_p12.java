package assignment4;
import java.util.Scanner;
public class SmallestLargest_p12 {
	public static void main(String[] args) {
		//Program to enter the numbers till user wants and at the end of the program should 
		//display the largest and smallest number entered.
		 Scanner sc= new Scanner(System.in);
		 char opt;int num;
		 //bulit in methods are used to find max and min values
		 int largest=Integer.MIN_VALUE,smallest=Integer.MAX_VALUE; 
		 do {
		 System.out.println("Enter the number");
		 num =sc.nextInt();
		 if(num>largest)
		 largest=num;
		 else if(num<smallest)
		 smallest=num;
		 
		 System.out.println("If u want to enter more type y");
		 opt=sc.next().charAt(0);
		 }
		 while(opt=='y');
		 
		 System.out.println("the largest numbers is "+ largest);
		 System.out.println("the negative numbers is "+smallest);
		 
		 }
}
