//12345678910
//11121314151617181920
//21222324252627282930
//31323334353637383940
//41424344454647484950
//51525354555657585960
//61626364656667686970
//71727374757677787980
//81828384858687888990
//919293949596979899100
package code;

import java.util.Scanner;

public class pattern6 
{
	public static void main(String arg[])
	{
		System.out.print("Enter the Number:-");
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int m=x.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(m);
				m++;
			}
			System.out.println();
		}
	}
}
