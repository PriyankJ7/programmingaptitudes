package com.xworksz.patterns.starpatterns;

public class TwoDiagonal {

	public static void main(String[] args) {
		System.out.println(" two daigonal");
		int num = 4;
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if(i==j||i+j==4)
				{
					System.out.print("*");

				} else {
					System.out.print(" ");

				}

			}
			System.out.println();
				
				}
			}
	}


