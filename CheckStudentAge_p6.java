package assignment5;
import java.util.Scanner; 
public class CheckStudentAge_p6{ 
public static void main(String[] args) { 
// Write a program to check age of student is greater than 18. 
Scanner sc =new Scanner(System.in); 
System.out.println("Enter the age:"); 
int age=sc.nextInt(); 
String result=age>18?"major":"minor"; //Conditional operator is used to check the condition and display
System.out.println(result); 
} 
} 