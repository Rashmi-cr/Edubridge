package assignment10;

 
public class Occurance_p4 { 
public static void main(String[] args) { 
 
String str1="GoodEvening"; 
int ch=str1.indexOf("e"); 
System.out.println(" occurrence of the specified character :"+ch); 
int ch1=str1.indexOf("n",4); 
System.out.println(" Starting the searc at specified position :"+ch1); 
System.out.println("canonical representation for the string object "+str1.intern()); 
System.out.println("Returns true if, and only if, length() is 0. "+str1.isEmpty()); 
System.out.println("Returns the length of this string "+str1.length()); 
} 
} 

