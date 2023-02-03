package assignment8;
import java.util.Scanner; 
public class StartCase_p9 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a sentence");
String s = sc.nextLine();
UserMainCode8 sim = new UserMainCode8();
String y = sim.printCapitalized(s);
System.out.println(y);
}
}
class UserMainCode8{
String printCapitalized(String s) {
String[] words =s.split("\\s");
String CapitalWords = "";
for(String s1:words) {
String f=s1.substring(0, 1);
String af=s1.substring(1);
CapitalWords += f.toUpperCase() + af+" ";
}
return CapitalWords.trim(); 
}
}