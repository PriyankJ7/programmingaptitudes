package com.xworksz.patterns.starpatterns;

public class BottomTriangle {
	public static void main(String[] args)
	{
		int num = 4;
		int mid=num/2;
		for (int i = 0; i <= num; i++)
		{
			for (int j = 0; j <= num; j++)
			{
				if(i==mid||i-j==mid||i+j==num+mid)
				{
					System.out.print("*");
					
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();

	}

}
}

