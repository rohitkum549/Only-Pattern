// ********
// *      *
// *      *
// *      *
// *      *
// *      *
// *      *
// ********
package code;

import java.util.Scanner;

public class hollowsquare 
{
	public static void main (String args[])
	{
		System.out.print("Enter the number:- ");
		Scanner x=new Scanner (System.in);
		int n=x.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0||j==0||i==n-1||j==n-1)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
