package code;

import java.util.Scanner;

public class pattern8 
{
	public static void main(String args[])
	{
		System.out.print("Enter the Number:-");
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int k=x.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(k+" ");
				k=k+2;
			}
			System.out.println();
		}
	}
}
