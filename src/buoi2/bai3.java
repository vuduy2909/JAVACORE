//3.	In dãy số 2, 4, 6, 8, 10 … 2n (n là số được nhập vào từ bàn phím) bằng vòng lặp for.
package buoi2;

import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n;

		do {
			System.out.print("Nhap so nguyen duong n = ");
			n = input.nextInt();
		} while (n <= 0);
		for (int i = 2; i <= 2 * n; i += 2) {
			System.out.print(i + " ");
		}
		input.close();
	}

}
