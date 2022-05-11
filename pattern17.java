package code;

import java.util.Scanner;

public class pattern17 
{
	public static void main(String args[])
	{
		System.out.print("Enter the number:-");
		Scanner x=new Scanner (System.in);
		int n=x.nextInt();
		int k=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print((2*(i+j)-3)+" ");
			}
			System.out.println();
			
		}
		
	}
}
