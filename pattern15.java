// 9 10 27 28 45 46 63 64 81
// 8 11 26 29 44 47 62 65 80
// 7 12 25 30 43 48 61 66 79
// 6 13 24 31 42 49 60 67 78
// 5 14 23 32 41 50 59 68 77
// 4 15 22 33 40 51 58 69 76
// 3 16 21 34 39 52 57 70 75
// 2 17 20 35 38 53 56 71 74
// 1 18 19 36 37 54 55 72 73
package code;

import java.util.Scanner;

public class pattern15 
{
	public static void main(String args[])
	{
		System.out.print("Enter the Number:-");
		Scanner x=new Scanner (System.in);
		int n=x.nextInt();
		int q=0;
		int w=0;
		for(int i=1;i<=n;i++)
		{
			q=i;
			w=n-i+1;
			for(int j=1;j<=n;j++)
			{
				if(j%2==0)
				{
					System.out.print(" "+q);
				}
				else
				{
					System.out.print(" "+w);
				}
				q=q+n;
				w=w+n;
			}
			System.out.println();
		}
	}
}
