package code;

import java.util.Scanner;

public class halfpyramid 
{
	public static void main(String args[])
	{
		System.out.print("Enter the number:-");
		Scanner x=new Scanner (System.in);
		int n=x.nextInt();
		halfpyramid h=new halfpyramid();
		int k=h.half(n);
	}
	public int half(int a)
	{
		int i;
		for(i=0;i<a;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		return i;
	}
}
