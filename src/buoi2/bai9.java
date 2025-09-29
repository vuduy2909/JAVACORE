//9.	In dãy số 1, 3, 5, 7, 9 … n (n là số được nhập vào từ bàn phím) bằng vòng lặp while 
//	và bằng 2 cách khác nhau.
package buoi2;

import java.util.Scanner;

public class bai9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhap so nguyen duong n=");
			n = input.nextInt();
		} while (n < 0);
		int i = 1;
		//Cách while
		while (i <= n) {
			System.out.print(i + " ");
			i += 2;
		}

		if (n % 2 == 0) {
			System.out.print(n);
		}
		// In ra them n neu n chan
		// n=8 // 1 3 5 7 8
		System.out.println();
		//Cách for
		for (i = 1; i <= n; i += 2) {
			System.out.print(i + " ");
		}
		if (n % 2 == 0) {
			System.out.print(n);
		}
		input.close();
	}
	
}
