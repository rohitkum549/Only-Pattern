//1 18 19 36 37 54 55 72 73 
//2 17 20 35 38 53 56 71 74 
//3 16 21 34 39 52 57 70 75 
//4 15 22 33 40 51 58 69 76 
//5 14 23 32 41 50 59 68 77 
//6 13 24 31 42 49 60 67 78 
//7 12 25 30 43 48 61 66 79 
//8 11 26 29 44 47 62 65 80 
//9 10 27 28 45 46 63 64 81 
package code;

import java.util.Scanner;

public class pattern13 
{
	public static void main(String args[])
	{
		System.out.print("Enter the Number:-");
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int y,z;
		int i=1;
		while(i<=n)
		{
			z=i;
			y=n-i+1;
			int j=1;
			while(j<=n)
			{
				if(j%2==1)
				{
					System.out.print(z+" ");
				}
				else
				{
					System.out.print(y+" ");
				}
				z=z+n;
				y=y+n;
				j++;
			}
			System.out.println();
			i++;
		}
		
	}
}
