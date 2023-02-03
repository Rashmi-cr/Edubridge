package assignment8;
import java.util.Scanner;
public class FetchMiddleChar_p3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a even length string");
	String s = sc.next();
	String s1 = UserMainCode2.getMiddleChars(s);
	System.out.println(s1);
	}
	}
	class UserMainCode2 {
	public static String getMiddleChars(String str)
	{
	StringBuffer stringbuffer=new StringBuffer();
	if(str.length()%2==0)
	{
		stringbuffer.append(str.substring((str.length()/2)-1,(str.length()/2)+1));
	}
	return stringbuffer.toString();
	}
	}


