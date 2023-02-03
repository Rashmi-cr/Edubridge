package assignment3;
import java.util.Scanner;

public class LeapYear_p1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stubpublic class LeapYear {
		//to check whethere given year is leap year or not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		    int year = sc.nextInt(); // int variable to store the year
		  //condition to check given year is leap year or not
		    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
		      System.out.println(year + " is a leap year.");
		    } else {
		      System.out.println(year + " is not a leap year.");
		    }
		  }
		}


