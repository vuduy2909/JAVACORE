/*
Nhap so nguyen duong n=4
   *
  ***
 *****
*******
*/
package buoi2;

import java.util.Scanner;

public class Bai33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int i = 1, j = 1, n;
		do {
			System.out.print("Nhap so nguyen duong n=");
			n = input.nextInt();
		} while (n < 1);
		do {
			j = 1;
			do {
				if (i == n)
					break;
				System.out.print(" ");
				j++;
			} while (j <= n - i);
			j = 1;
			do {
				System.out.print("*");
				j++;
			} while (j <= 2 * i - 1);
			i++;
			System.out.println();
		} while (i <= n);

	}

}
