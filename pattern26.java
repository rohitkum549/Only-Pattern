//A A A A A A A A A A A A A A A A A A A A A A A A A A 
//B B B B B B B B B B B B B B B B B B B B B B B B B B 
//C C C C C C C C C C C C C C C C C C C C C C C C C C 
//D D D D D D D D D D D D D D D D D D D D D D D D D D 
//E E E E E E E E E E E E E E E E E E E E E E E E E E 
//F F F F F F F F F F F F F F F F F F F F F F F F F F 
//G G G G G G G G G G G G G G G G G G G G G G G G G G 
//H H H H H H H H H H H H H H H H H H H H H H H H H H 
//I I I I I I I I I I I I I I I I I I I I I I I I I I 
//J J J J J J J J J J J J J J J J J J J J J J J J J J 
//K K K K K K K K K K K K K K K K K K K K K K K K K K 
//L L L L L L L L L L L L L L L L L L L L L L L L L L 
//M M M M M M M M M M M M M M M M M M M M M M M M M M 
//N N N N N N N N N N N N N N N N N N N N N N N N N N 
//O O O O O O O O O O O O O O O O O O O O O O O O O O 
//P P P P P P P P P P P P P P P P P P P P P P P P P P 
//Q Q Q Q Q Q Q Q Q Q Q Q Q Q Q Q Q Q Q Q Q Q Q Q Q Q 
//R R R R R R R R R R R R R R R R R R R R R R R R R R 
//S S S S S S S S S S S S S S S S S S S S S S S S S S 
//T T T T T T T T T T T T T T T T T T T T T T T T T T 
//U U U U U U U U U U U U U U U U U U U U U U U U U U 
//V V V V V V V V V V V V V V V V V V V V V V V V V V 
//W W W W W W W W W W W W W W W W W W W W W W W W W W 
//X X X X X X X X X X X X X X X X X X X X X X X X X X 
//Y Y Y Y Y Y Y Y Y Y Y Y Y Y Y Y Y Y Y Y Y Y Y Y Y Y 
//Z Z Z Z Z Z Z Z Z Z Z Z Z Z Z Z Z Z Z Z Z Z Z Z Z Z 
package code;

import java.util.Scanner;

public class pattern26 
{
	public static void main(String args[])
	{
		System.out.print("Enter the Char:-");
		Scanner X=new Scanner(System.in);
		char i=X.next().charAt(0);
		System.out.print("Enter the Char:-");
		char j=X.next().charAt(0);
		for(char k=i;k<='Z';k++)
		{
			for(char l=j;l<='Z';l++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
	}
}
