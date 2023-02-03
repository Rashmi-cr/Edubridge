package assignment9;

import java.util.*;
public class SalaryCount_p5
{
	public static void main(String[] args){
	int n, i,j,k,count=1;
	Scanner in=new Scanner(System.in);
	System.out.println("enter size");
	n = in.nextInt();
	System.out.println("enter values");
	if(n < 0){
		System.out.print("Invalid array size");
		System.exit(0);
		}else
		{
			int a[]=new int[100];
			for(i = 0; i< n; i++)
			{
				a[i] = in.nextInt();
				if(a[i] < 0)
				{
					System.out.print("Invalid input");
					System.exit(0);
					}
				}
			for(i=0;i<n;i++)
			{
				for(j=i+1;j<n;)
				{
					if(a[i]==a[j])
					{
						count++;
						for(k=j;k<n;k++)a[k]=a[k+1];
						n--;
						}
					else
						j++;
					}
				}
			System.out.print(count);
		}
	}
}
