package assignment3;
import java.util.Scanner;
public class DaysInMonth_p7 {
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter the month number : ");
int monthNum = sc.nextInt();
switch (monthNum) {
case 1:
System.out.println("31 days in january");
break;
case 2:
System.out.println("28 days or 29 days in Feb");
break;
case 3:
System.out.println("31 days in march");
break;
case 4:
System.out.println("30 days in april");
break;
case 5:
System.out.println("31 days in may");
break;
case 6:
System.out.println("30 days in june");
break;
case 7:
System.out.println("31 days in july");
break;
case 8:
System.out.println("31 days in august");
break;
case 9:
System.out.println("30 days in september ");
break;
case 10:
System.out.println("31 days in october");
break;
case 11:
System.out.println("30 days in november ");
break;
case 12:
System.out.println("31 days in december ");
break;
default:
System.err.println("Invalid Input ,Please check It ");
}
}
}

