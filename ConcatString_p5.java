package assignment10;
import java.util.Scanner; 
public class ConcatString_p5{ 
public static void main(String[] args) { 
// TODO Auto-generated method stub 
	//Java program to concatenate a given string with itself of a given number of times.
String ch="rashmi "; 
System.out.println("Enter the number For contact the string"); 
Scanner sc =new Scanner(System.in); 
int times=sc.nextInt(); 
StringBuilder sb = new StringBuilder(); 
for (int i = 0; i < times; i++) { 
sb.append(ch); 
} 
System.out.println(sb.toString()); 
} 
} 
