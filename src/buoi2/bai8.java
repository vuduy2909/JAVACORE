//8.	In dãy số 1, 2, 3, 4, 5 … n (n là số được nhập vào từ bàn phím) bằng vòng lặp while.
package buoi2;

import java.util.Scanner;

public class bai8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhap so nguyen duong n=");
			n = input.nextInt();

		} while (n < 0);
		int i =1;
		while (i<=n) {
			System.out.print( i+ " ");
			i++;
		}
		input.close();
	}

}
