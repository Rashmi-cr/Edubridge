package assignment4;
import java.util.Scanner;
public class ReverseOfNumber_p6 {
	public static void main(String[] args) {
		//program that prompts the user to input an integer and then outputs the number with 
		//the digits reversed.
		 System.out.println("enter the number");
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int sum = 0, r;
		 while (n > 0) { // to check wheter the number is positive or not
		 r = n % 10;
		 sum = (sum * 10) + r;
		 n = n / 10;
		 }
		System.out.println(sum);
		}	
}

