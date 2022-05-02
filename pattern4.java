//999999999
//888888888
//777777777
//666666666
//555555555
//444444444
//333333333
//222222222
//111111111
package code;

import java.util.Scanner;

public class pattern4 
{
	public static void main (String args[])
	{
		System.out.print("Enter the number :-");
		Scanner x=new Scanner (System.in);
		int n=x.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(i);	
			}
			System.out.println();
		}
	}
}
