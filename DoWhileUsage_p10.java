package assignment4;
import java.util.Scanner;
public class DoWhileUsage_p10 {
	public static void main(String[] args) {
		/*Do while loop that asks the user to enter two numbers ,the number should be added 
and the sum displayed,the loop should ask the users whether he or she 
wishes to perrform the operation again,if so the loop should repeat otherwise it should terminate.
*/
		 int ch;
		 Scanner sc = new Scanner(System.in);
		 int a, b, sum;
		 do {
		 System.out.println("Enter two numbers");
		 a = sc.nextInt();
		 b = sc.nextInt();
		 sum = a + b;
		 System.out.println("The sum is:" + sum);
		 System.out.println("Do u want to continue with this operation:( if yes press 1 else press 0)");
		 ch = sc.nextInt();
		 }
		 while (ch == 1);
		 
		}
		}

