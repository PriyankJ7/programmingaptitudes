package com.xworksz.patterns.starpatterns;

public class Sqaure {

	public static void main(String[] args) {
		System.out.println("Square methods");

		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				if (i == 0||i==4||j==0||j==4)
				{

					System.out.print("*");
				}

				else {
					System.out.print(" ");

				}
			}
			System.out.println();
		}
	}

}
