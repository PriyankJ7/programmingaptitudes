
package com.xworksz.patterns.starpatterns;

public class SecondaryDaigonal {

	public static void main(String[] args) {
		int num = 5;
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if (i + j == 4) {
					System.out.print("*");

				} else {
					System.out.print(" ");

				}

			}
			System.out.println();

		}

	}

}
