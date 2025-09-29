//12.	In dãy số 1, -3, 7, -15, 31, …n (n là số được nhập vào từ bàn phím) bằng vòng lặp while.
package buoi2;

import java.util.Scanner;

public class bai12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhap so nguyen duong n=");
			n = input.nextInt();
		} while (n < 1);
		int i = 1;
		double value = 1;
		while (value <= n) {
			value = (Math.pow(2, i) - 1);
			if (value > n) {
				break;
			}
			if (i % 2 == 1) {
				System.out.print(value + " ");
			} else {
				System.out.print(-1 * (value) + " ");
			}
			i++;
		}
		input.close();
	}

}
