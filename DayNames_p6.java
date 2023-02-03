package assignment3;
import java.util.Scanner;
public class DayNames_p6 {
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter day number : ");
int dayNum = sc.nextInt();
switch (dayNum) {
case 1:
System.out.println("Sunday");
break;
case 2:
System.out.println("Monday");
break;
case 3:
System.out.println("Tuesday");
break;
case 4:
System.out.println("Wednesday");
break;
case 5:
System.out.println("Thursday");
break;
case 6:
System.out.println("Friday");
break;
case 7:
System.out.println("Saturday");
break;
default:
System.out.println("Invalid Input ,Please enter valid input from 1 to 7 ");
}
}
}

