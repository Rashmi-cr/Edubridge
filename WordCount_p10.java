package assignment8;
import java.util.Scanner;
public class WordCount_p10{
public static void main(String[] args) {
UserMainCode9 sim = new UserMainCode9();
int y = sim.wordCount();
System.out.println(y);
}
}
class UserMainCode9{
int wordCount() {
Scanner sc = new Scanner(System.in);
int count = 0;
System.out.println("Enter a sentence");
String s = sc.nextLine();
System.out.println("please type the word for which you want to perform wordCount");
String s1 = sc.nextLine();
String s3 = s.toLowerCase(); 
String[] words =s.split(" ");
System.out.println("count of word you entered is:");
for(int i=0;i<words.length;i++) {
if(words[i].equals(s1)) {
count++;
}
}
return count;
}
}

