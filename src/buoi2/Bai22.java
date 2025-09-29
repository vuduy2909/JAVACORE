//22.	In các hình * sau đây: (chiều dài các cạnh là không cố định)

package buoi2;

import java.util.Scanner;

public class Bai22 {

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
		 ******
		 ******
		 ******
		 ******
		 */
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		/*
		 ******
		 *    * 
		 *    * 
		 *    *
		 ******
		 */
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n)
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
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1)
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
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == n)
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

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == n || j == 1 || j == n)
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
