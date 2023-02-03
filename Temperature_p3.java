package assignment3;
import java.util.Scanner;
class Temperature_p3
{

public static void main(String args[])
{

Scanner sc = new Scanner(System.in);

System.out.print("Enter the temperature: ");

int temp=sc.nextInt();

String s="";

if(temp<=0)

s="Freezing ";
else if(temp>=21&&temp<=30)

s="Normal ";

else if(temp>=31&&temp<=40)

s="Hot ";

else if(temp>40)

s="Very hot ";

System.out.println(s+ "weather.");

}
}