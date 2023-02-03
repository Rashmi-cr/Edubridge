package assignment5;
import java.util.Scanner; 
public class GreaterNo_p8 { 
public static void main(String[] args) { 
// write a program to check whether number is greater than 100 and 200. 
Scanner sc =new Scanner(System.in); 
System.out.println("Enter a number:"); 
int num=sc.nextInt(); 
int num1=100, num2=200; 
String result = num > num1 && num > num2 ? "number is greater than 100 and 200." : "number is not greater than 100 and 200."; 
System.out.println(result); 
} 
} 