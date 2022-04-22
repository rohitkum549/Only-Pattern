         
//           *
//          * *
//         * * *
//        * * * *
//       * * * * *
//      * * * * * *
//     * * * * * * *
//    * * * * * * * *
//   * * * * * * * * *

package code;

import java.util.Scanner;

public class pyramid 
{
	public int tree(int a)
	{
		int i;
		for(i=0;i<a;i++)
		{
			for(int j=a;j>=1;j--)
			{
				if (j>i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(" *");
				}
			}
			System.out.println();
		}
		return i;
	}
	public static void main (String args[])
	{
		System.out.print("Enter the number:-");
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		pyramid p=new pyramid(); //i created a object name p
		int d=p.tree(n);// here i send the value of n 
	}
}
