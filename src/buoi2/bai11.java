//11.	In dãy số 1, 3, 7, 15, 31, …n (n là số được nhập vào từ bàn phím) bằng vòng lặp while.
// Quy luật 2^i-1
package buoi2;

import java.util.Scanner;

public class bai11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhap so nguyen duong n=");
			n = input.nextInt();

		} while (n < 1);
		int i = 1, value = 1;
		while (value <= n) {

			value = (int) (Math.pow(2, i) - 1);
			i++;
			if (value < n) {
				System.out.print(value + " ");
			} else {
				System.out.println(n);
			}
		}
		input.close();
	}

}
