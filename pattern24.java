//0 1 0 1 0 1 0 1 0 1 
//0 1 0 1 0 1 0 1 0 1 
//0 1 0 1 0 1 0 1 0 1 
//0 1 0 1 0 1 0 1 0 1 
//0 1 0 1 0 1 0 1 0 1 
//0 1 0 1 0 1 0 1 0 1 
//0 1 0 1 0 1 0 1 0 1 
//0 1 0 1 0 1 0 1 0 1 
//0 1 0 1 0 1 0 1 0 1 
//0 1 0 1 0 1 0 1 0 1 
package code;

import java.util.Scanner;

public class pattern24 
{
	public static void main (String args[])
	{
		System.out.print("Enter the Number:-");
		Scanner X=new Scanner(System.in);
		int n=X.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print((j%2)+" ");
			}
			System.out.println();
		}
	}
}
