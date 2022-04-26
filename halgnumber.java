//1
//22
//333
//4444
//55555
//666666
//7777777
//88888888
//999999999
package code;
import java.util.Scanner;
public class halgnumber
{
	public int hnumber(int a)
	{
		int i;
		for(i=1;i<a;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		return i;
	}
	public static void main(String args[])
	{
		System.out.print("Enter the number :-");
		Scanner x=new Scanner (System.in);
		int n=x.nextInt();
		halgnumber h=new halgnumber();
		int k=h.hnumber(n);
	}
}

