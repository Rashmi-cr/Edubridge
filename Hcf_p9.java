package assignment4;
import java.util.Scanner;
public class Hcf_p9 {
public static void main(String[] args) {
	//program to calculate HCF of Two given number.
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the first number:");
 int a = sc.nextInt();
 System.out.println("Enter the second number:");
 int b = sc.nextInt();
 int hcf=0;
 for(int i=1;i<=a||i<=b;i++) {
 if(a%i==0 && b%i==0)
 hcf=i;
 }
 System.out.println("The HCF of the given numbers is:"+hcf );
 
 }
}



