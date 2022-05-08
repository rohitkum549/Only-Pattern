//9 18 27 36 45 54 63 72 81 
//8 17 26 35 44 53 62 71 80 
//7 16 25 34 43 52 61 70 79 
//6 15 24 33 42 51 60 69 78 
//5 14 23 32 41 50 59 68 77 
//4 13 22 31 40 49 58 67 76 
//3 12 21 30 39 48 57 66 75 
//2 11 20 29 38 47 56 65 74 
//1 10 19 28 37 46 55 64 73 

package code;

import java.util.Scanner;

public class pattern14 
{
	public static void main(String args[])
	{
		System.out.print("Enter the Number:-");
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int y=0;
		for(int i=1;i<=n;i++)
		{
			y=n-i+1;
			for(int j=1;j<=n;j++)
			{
				System.out.print(y+" ");
				y=y+n;
			}
			System.out.println();
		}
	}
}
