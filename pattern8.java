//2 4 6 8 10 12 14 16 18 20 
//22 24 26 28 30 32 34 36 38 40 
//42 44 46 48 50 52 54 56 58 60 
//62 64 66 68 70 72 74 76 78 80 
//82 84 86 88 90 92 94 96 98 100 
//102 104 106 108 110 112 114 116 118 120 
//122 124 126 128 130 132 134 136 138 140 
//142 144 146 148 150 152 154 156 158 160 
//162 164 166 168 170 172 174 176 178 180 
//182 184 186 188 190 192 194 196 198 200 

package code;

import java.util.Scanner;

public class pattern8 
{
	public static void main(String args[])
	{
		System.out.print("Enter the Number:-");
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int k=x.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(k+" ");
				k=k+2;
			}
			System.out.println();
		}
	}
}
