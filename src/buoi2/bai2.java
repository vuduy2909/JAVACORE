//2.	In dãy số 1, 3, 5, 7, 9 … n (n là số được nhập vào từ bàn phím) bằng vòng lặp for và bằng 2 cách khác nhau.
package buoi2;

import java.util.*;

public class bai2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n;

		do {
			System.out.print("Nhap so nguyen duong n = ");
			n = input.nextInt();
		} while (n <= 0);

		// Cach 1
		System.out.println("Cach 1:");
		for (int i = 1; i <= n; i += 2) {
			System.out.print(i + " ");
			if ((n - i) == 1) { // in n khi n chan (n co the la so chan hoac so le)

				{
					System.out.println(n);
				}

			}

		}

		// Cach 2
		System.out.println("Cach 2:");
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
			if ((n - i) == 0) { //in n khi n chan
				{
					System.out.println(n);
				}
			}
		}

		input.close();
	}
}
