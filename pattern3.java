package code;
import java.util.*;
public class pattern3 
{
	public static void main (String args[])
	{
		System.out.print("Enter the number:-");
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}
