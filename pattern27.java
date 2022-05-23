//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 

package code;

import java.util.Scanner;

public class pattern27 
{
	public static void main(String args[])
	{
		System.out.print("Enter the Char:-");
		Scanner X=new Scanner (System.in);
		char a=X.next().charAt(0);
		System.out.print("Enter the Char:-");
		char b=X.next().charAt(0);
		System.out.print("Enter the End Char:-");
		char n=X.next().charAt(0);
		for(char i=a;i<=n;i++)
		{
			for(char j=b;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
