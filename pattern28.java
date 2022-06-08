//E E E E E 
//D D D D D 
//C C C C C 
//B B B B B 
//A A A A A 
package code;
import java.util.*;
public class pattern28 
{
	public static void main(String args[])
	{
		System.out.print("Enter the Char:-");
		Scanner X=new Scanner (System.in);
		char a=X.next().charAt(0);
		System.out.print("Enter the length of Char:-");
		char b=X.next().charAt(0);
		for(char i=a;i>=b;i--)
		{
			for(char j=a;j>=b;j--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
