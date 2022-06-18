//A B C D E F G H I J K 
//A B C D E F G H I J K 
//A B C D E F G H I J K 
//A B C D E F G H I J K 
//A B C D E F G H I J K 
//A B C D E F G H I J K 
//A B C D E F G H I J K 
//A B C D E F G H I J K 
//A B C D E F G H I J K 
//A B C D E F G H I J K 
//A B C D E F G H I J K 
package code;
import java.util.*;
import java.util.Scanner;

public class pattern29 
{
	public static void main(String args[])
	{
		System.out.print("Enter the 1st Char:-");
		Scanner X=new Scanner(System.in);
		char a=X.next().charAt(0);
		System.out.print("Enter the 2nd Char:-");
		char b=X.next().charAt(0);
		for(char i=a;i<=b;i++)
		{
			for(char j=a;j<=b;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}
