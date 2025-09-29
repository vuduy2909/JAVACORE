package buoi2;

import java.util.Scanner;

public class bai23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhap so nguyen duong n=");
			n = input.nextInt();
		} while (n < 1);
		/*
		*
		**
		***
		****
		*****
		*/

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		/*
		*****
		****
		***
		**
		*
		*/
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		/*
		     *
		    **
		   ***
		  ****
		 *****
		 */
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j <= n - i)
					System.out.print(" ");
				else
					System.out.print("*");
			}

			System.out.println();
		}
		System.out.println();

		/*
		*****
		 ****
		  ***
		   **
		    *
		*/

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j < i)
					System.out.print(" ");
				else
					System.out.print("*");
			}

			System.out.println();
		}
		System.out.println();

		/*
		 *****
		 * * *
		 **
		 *
		 */

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				if (i == n || i == 1 || j == 1 || j == i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		/*
		   *    
		  ***
		 *****
		*******
		*/

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		/*
		*******
		 *****
		  ***
		   *    
		*/
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * n - 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		input.close();

	}

}
