package assignment10;
import java.util.Scanner; 
public class Palidrome_p7{ 
public static void main(String[] args) { 
 
System.out.println("enter a name to check plaidrome or not:"); 
Scanner sc=new Scanner(System.in); 
String var=sc.next(); 
System.out.println(var); 
StringBuilder sb = new StringBuilder(var); 
String reversed = sb.reverse().toString(); 
System.out.println(reversed); 
if(var.equals(reversed)) // we can't use "==" operator bcoz reversed is an object so we have to use Default method String.equals(String) 
{ 
System.out.println("palidrome");
}else {
	System.out.println("not palidrome");
}
}
}