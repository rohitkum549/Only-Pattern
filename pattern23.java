//1 1 1 1 1 1 1 1 1 1 
//0 0 0 0 0 0 0 0 0 0 
//1 1 1 1 1 1 1 1 1 1 
//0 0 0 0 0 0 0 0 0 0 
//1 1 1 1 1 1 1 1 1 1 
//0 0 0 0 0 0 0 0 0 0 
//1 1 1 1 1 1 1 1 1 1 
//0 0 0 0 0 0 0 0 0 0 
//1 1 1 1 1 1 1 1 1 1 
//0 0 0 0 0 0 0 0 0 0 

package code;

import java.util.Scanner;

public class pattern23 
{
	public static void main(String arg[])
	{
		System.out.print("Enter The Number:-");
		Scanner X=new Scanner (System.in);
		int n=X.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print((i%2)+" ");
			}
			System.out.println();
		}
	}
}
