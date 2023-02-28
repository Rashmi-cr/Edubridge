package assignment10; 
import java.util.Scanner; 
public class UniCode_p2 { 
public static void main(String[] args) { 
 
Scanner scanner=new Scanner(System.in); 
String str="Always there to help you !"; 
System.out.println("Original String :"+str); 
System.out.println("Enter the index number which you want to print:"); 
int n=scanner.nextInt(); 
System.out.println("Character Unicode at point at the "+n+" index: "+str.codePointAt(n)); 
System.out.println("Character character (Unicode code point) before the "+n+" index: "+str.codePointBefore(n)); 
System.out.println("Enter ending index :"); 
int m=scanner.nextInt(); 
System.out.println("number of Unicode code points in the specified text range of this String"+str.codePointCount(n, m)); 
} 
} 