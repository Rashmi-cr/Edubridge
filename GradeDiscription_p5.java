package assignment3;
import java.util.Scanner;
public class GradeDiscription_p5 {
public static void main(String[] args) {
	/*doubt: if we want to enter the marks i.e int type and get grade 
	eg: if marks>90 then grade is outstanding
	 if marks>=85 and <90 then grade is distinction
	 then can't we use switch , if we go for if else , what if the conditions are more
	 is there any other way*/
Scanner sc = new Scanner(System.in);
System.out.println(" enter your Grade : ");
char grade = sc.next().charAt(0); // charAt() is used to enter the char input from the user
switch (grade) {
case 'A', 'a':
System.out.println("Average");
break;
case 'G', 'g':
System.out.println("Good");
break;
case 'V', 'v':
System.out.println(" Very Good");
break;
case 'E', 'e':
System.out.println("EXcellent ");
break;
case 'F', 'f':
System.out.println("Fail");
break;
default:
System.out.println("Inavlid Input");
}
}
}