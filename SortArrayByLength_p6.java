package assignment10;
import java.util.Arrays; 
public class SortArrayByLength_p6 { 
public static void main(String[] args) { 
 
String[] words = {"apple", "banana", "cherry", "date", "elderberry"}; 
Arrays.sort(words, (a, b) -> a.length() - b.length()); 
System.out.println(Arrays.toString(words)); 
Arrays.sort(words, (a, b) -> b.length() - a.length()); 
System.out.println(Arrays.toString(words)); 
} 
} 