//1.	In dãy số 1, 2, 3, 4, 5 … n (n là số được nhập vào từ bàn phím) bằng vòng lặp for.
package buoi2;

import java.util.*;

public class bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhap so nguyen duong n = ");
			n = input.nextInt();
		} while (n <= 0);
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
		input.close();
	}

}
