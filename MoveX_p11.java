package assignment8;
import java.util.Scanner;
public class MoveX_p11{
public static void main(String[] args) {
UserMainCode10 sim = new UserMainCode10();
String y = sim.moveX();
System.out.println(y);
}
}
class UserMainCode10{
String moveX() {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a word combination of x ");
String s =sc.next();
String c="";
String notX="";
for(int i=0;i<s.length();i++) {
if(s.charAt(i)=='x') {
c += "x";
}
else {
notX+=s.charAt(i);
}
}
return notX+c;
}
}

