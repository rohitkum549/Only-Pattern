package code;

import java.util.Scanner;

public class pattern18 
{
	public static void main(String args[])
	{
		System.out.print("Enter the Number:-");
		Scanner X=new Scanner(System.in);
		int n=X.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print((i+j)%2+" ");
			}
			System.out.println();
		}
		
	}
}
