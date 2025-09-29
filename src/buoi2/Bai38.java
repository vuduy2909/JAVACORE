//38.	In dãy số 2, -4, 6, 8, -10, 12, 14, 16, -18, ….., n (**)
package buoi2;

import java.util.Scanner;

public class Bai38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int i = 2, j = 4, biencong=6, n;
		do {
			System.out.print("Nhap so nguyen duong n=");
			n = input.nextInt();
		} while (n < 1);
		while (i <= n) {
			if (i == j) {
				System.out.println(-1 * j + " ");
				j+=biencong;
				biencong+=2;
				i+=2;
			} else {
				System.out.println(i + "");
				i += 2;
			}
		}
	}

}
