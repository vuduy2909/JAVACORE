//30.	In dãy số 1, 2, 3, 5, 8, 13, …n (n là số được nhập vào từ bàn phím) bằng vòng lặp do-while.
//Nhap so nguyen duong n=67
//3 5 8 13 21 34 55 67
package buoi2;

import java.util.Scanner;

public class Bai30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n, fn = 0, f0 = 1, f1 = 2;
		do {
			System.out.print("Nhap so nguyen duong n=");
			n = input.nextInt();
		} while (n < 1);
		System.out.print("1 2 ");
		do {
			fn = f0 + f1;
			System.out.print(fn + " ");
			f0 = f1;
			f1 = fn;

		} while (fn <= n && f0 + f1 <= n);
		if (f0 + f1 > n)
			System.out.print(n);

	}

}
