package assignment8;
import java.util.Scanner;
public class FormString_p1 {
public static void main(String[] args) {
UserMainCode us = new UserMainCode();
String sim = us.formString();
System.out.println(sim);
}
}
class UserMainCode{
String formString() {
Scanner sc = new Scanner(System.in);
System.out.println("Enter how many strings you want to enter");
int n = sc.nextInt();
String[] arr = new String[n];
System.out.println("Enter strings");
for(int i=0;i<arr.length;i++)
{
arr[i] = sc.next();
}
String s=" ";
System.out.println("Pick a number");
int num = sc.nextInt();
for(int i=0;i<arr.length;i++) {
if(num<arr[i].length()) {
s = s+arr[i].charAt(num);
}
else {
s = s+"$";
}
}
return s;
}
}

/*import java.util.Scanner;

public class FormString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,pos;
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the size");
		size=scanner.nextInt();
		String[] str=new String[size];
		for(int i=0;i<str.length;i++)
		{
			str[i]=scanner.next();
		}
		System.out.println("enter the nth char position to read");
		pos=scanner.nextInt();
		String message=UserMainCode.formString(str,size,pos);
		System.out.println(message);
	}

public class UserMainCode {
	//ABC XYZ MNC MN
	static String formString(String[] names,int size, int pos)
	{
		StringBuilder builder=new StringBuilder();
		for(int i=0;i<names.length;i++)
		{
			String s1=names[i];//ABC
			if(s1.length()>=pos)
				builder.append(s1.charAt(pos-1));
			else
				builder.append("$");
			
		}
		return builder.toString();
	}

}
*/
