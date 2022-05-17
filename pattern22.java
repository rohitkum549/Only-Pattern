//0 0 0 0 0 0 0 0 0 0 
//1 1 1 1 1 1 1 1 1 1 
//0 0 0 0 0 0 0 0 0 0 
//1 1 1 1 1 1 1 1 1 1 
//0 0 0 0 0 0 0 0 0 0 
//1 1 1 1 1 1 1 1 1 1 
//0 0 0 0 0 0 0 0 0 0 
//1 1 1 1 1 1 1 1 1 1 
//0 0 0 0 0 0 0 0 0 0 
//1 1 1 1 1 1 1 1 1 1 
package code;

import java.util.Scanner;

public class pattern22 
{
	public static void main(String arg[])
	{
		System.out.print("Enter The Number:-");
		Scanner X=new Scanner (System.in);
		int n=X.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print((i%2)+" ");
			}
			System.out.println();
		}
	}
}
