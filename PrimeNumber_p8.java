package assignment4;
import java.util.Scanner;
public class PrimeNumber_p8{
public static void main(String[] args) {
	//to check the number is prime or not
 System.out.println("Enter the positive integer");
 Scanner sc = new Scanner(System.in);
 int a = sc.nextInt();
 System.out.println(((a % 2) > 0) ? "It is a prime number" : "It is not a prime number");
 //conditional operator is used to check multiple conditions 
}
}