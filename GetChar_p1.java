package assignment10; 
import java.util.Scanner; 
public class GetChar_p1 { 
public static void main(String[] args) { 
 
Scanner scanner=new Scanner(System.in); 
String str="Welcome to Java !"; 
System.out.println("Original String :"+str); 
System.out.println("Enter the index number which you want to print:"); 
int n=scanner.nextInt(); 
System.out.println("Character at the "+n+ " Position is :"+str.charAt(n)); 
} 
} 
 