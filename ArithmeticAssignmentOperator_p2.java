package assignment5;
import java.util.Scanner;
public class ArithmeticAssignmentOperator_p2 {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter two numbers");
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("a+=b=" + (a+=b));//this operation performs a=a+b
	System.out.println("a-=b="+(a-=b));//this operation performs a=a-b
	System.out.println("a*=b="+(a*=b));//this operation performs a=a*b
	System.out.println("a/=b1"+(a/=b));//this operation performs a1=a1/b1
	System.out.println("a%=b"+(a%=b)); //this operation performs a1=a1%b1 the value of b1 to a1
	System.out.println("a=b"+(a=b));//this assigns the value of b1 to a1 	
	}
	}

