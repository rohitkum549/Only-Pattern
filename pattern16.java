//1 2 3 4 5 
//2 3 4 5 6 
//3 4 5 6 7 
//4 5 6 7 8 
//5 6 7 8 9 

package code;

import java.util.Scanner;

public class pattern16 
{
	public static void main(String args[])
	{
		System.out.print("Enter the Number:-");
		Scanner x=new Scanner (System.in);
		int n=x.nextInt();
		int k=0;
		for(int i=1;i<=n;i++)
		{
			k=i;
			for(int j=1;j<=n;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
}
