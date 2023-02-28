package assignment10; 
public class compareStrig_p3 { 
public static void main(String[] args) { 
 
String str1="Good"; 
String str2="good"; 
String str3="Hello"; 
String str4="good"; 
System.out.println("Comparing the strings lexicographically: "+str1.compareTo(str2)); 
System.out.println("Comparing the strings lexicographically: "+str1.compareTo(str3)); 
System.out.println("Comparing the strings lexicographically: "+str1.compareToIgnoreCase(str4)); 
} 
} 