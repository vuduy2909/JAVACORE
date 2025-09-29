package buoi2;

import java.util.Scanner;

public class Bai24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhap so nguyen duong n=");
			n = input.nextInt();
		} while (n < 1);

		/*
		******
		 *
		  *
		   *
		    *
		******
		*/
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || i == j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();

		/*
		******
		    *
		   *
		  *
		 *
		******
		*/
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || i == j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();

		/*
		 ******
		 * * * * * * * * *
		 ******
		 */
		for (int i = 1; i <= n; i++) {
			if (i == 1 || i == n) {
				for (int j = 1; j <= n; j++) {
					System.out.print("*");
				}
			} else {
				if (i % 2 == 0)
					for (int k = 1; k <= n / 2; k++) {
						System.out.print(" ");
						System.out.print("*");
					}
				else {
					for (int k = 1; k <= n / 2; k++) {
						System.out.print("*");
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}

		System.out.println();

		/*
		 ******
		 ** * * * * * **
		 ******
		 */
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n || i == j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		input.close();

	}

}
