package assignment8;
import java.util.Scanner;
public class RepeatString_p5 {
	public static void main(String[] args) {
	UserMainCode4 sim = new UserMainCode4();
	String y = sim.replicaString();
	System.out.println(y);
	}
	}
	class UserMainCode4{
	String replicaString() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string for replecation");
	String s = sc.next();
	System.out.println("Enter a number i.e., how many times do you want to perform replecation ?");
	int n = sc.nextInt();
	String s1= s.repeat(n);
	return s1;
	}
	}


