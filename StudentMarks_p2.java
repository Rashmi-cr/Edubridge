package assignment3;
import java.util.Scanner;
public class StudentMarks_p2 {
public static void main(String[] args) {
	/*to 2.program to read roll no, name and marks of three subjects 
	//and calculate the total, percentage and division*/
Scanner input = new Scanner(System.in);
System.out.print("Roll No of Student :");
int rollNo = input.nextInt();
System.out.print("Name of The Student :");
input.next();
String studentName = input.nextLine();
System.out.print("marks of physics ,chemistry and computer Appplication :");
int physicsMarks = input.nextInt();
int chemistryMarks = input.nextInt();
int computerAppMarks = input.nextInt();
double totalMarks = physicsMarks + chemistryMarks + computerAppMarks;
double percentage = (totalMarks / 300) * 100;
System.out.println("ROLL no : " + rollNo);
System.out.println("Name Of Student : " + studentName);
System.out.println("Marks in Physics : " + physicsMarks);
System.out.println("Marks in chemistry : " + chemistryMarks);
System.out.println("Marks in Computer Application: " + computerAppMarks);
System.out.println("Total Marks : " + totalMarks);
System.out.println(" Percentage : " + percentage);
if (percentage >= 90) {
System.out.println("Division = First");
} else if (percentage >= 60) {
System.out.println("Division = Second");
} else if (percentage >= 40) {
System.out.println("Division = Third ");
} else
System.err.println(" you are Falied !!");
}
}
