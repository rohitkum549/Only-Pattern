//987654321
//987654321
//987654321
//987654321
//987654321
//987654321
//987654321
//987654321
//987654321

package code;

import java.util.Scanner;

public class pattern5 
{
	public static void main(String args[])
	{
		System.out.print("Enter the number:-");
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=n;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
