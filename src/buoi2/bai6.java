package buoi2;

import java.util.*;

public class bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhap so nguyen duong n=");
			n = input.nextInt();

		} while (n <= 0);
		// Cach 1
		for (int i = 1; i <= (n / 2); i++) {
			int value = 2 * i;
			if ((i % 2) == 0) {

				value = -value;

			}
			System.out.print(value + " ");
		}
		if (n % 2 != 0) { // nếu n là số lẻ thì in thêm n
			System.out.println(n);
		}
		
		for (int i = 1; i <= (n / 2); i++) {
			int sign = -1;
			if (i % 2 == 1) {
				System.out.print(i * 2 + " ");
			} else {
				System.out.print(i * 2 * sign + " ");
			}
		}
		if (n % 2 != 0) { // nếu n là số lẻ thì in thêm n
			System.out.println(n);
		}

	}

}
//.	In dãy số 2, -4, 6, -8, 10 … n (n là số được nhập vào từ bàn phím) bằng cách sử dụng vòng lặp for và bằng 2 cách khác nhau. 
//Gợi ý: cách 1 dùng toán tử %, cách 2 dùng 1 biến để xác định dấu âm và dấu dương. (*)
