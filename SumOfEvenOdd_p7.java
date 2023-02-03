package assignment4;
	 import java.util.Scanner;
public class SumOfEvenOdd_p7 {
	     public static void main(String[] args) {
//program that read a set of integer,and then prints the sum of odd and even numbers.
	         Scanner sc = new Scanner(System.in);
	         int number, chioce, evenSum = 0, OddSum = 0;
	         do {
	             System.out.print("Enter the number ");
	             number = sc.nextInt();
	             if (number % 2 == 0) {
	                 evenSum += number;
	             } else {
	                 OddSum += number;
	             }
	             System.out.println("Do you want to continue? Press 1 for yes or 0 for no");
	             chioce = sc.nextInt();
	         } while (chioce == 1);
	         System.out.println("Sum of even numbers: " + evenSum);
	         System.out.println("Sum of odd numbers: " + OddSum);
	     }
	 }

