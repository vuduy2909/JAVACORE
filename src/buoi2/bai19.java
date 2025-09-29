//19.	Viết chương trình in ra hình vuông với những chữ A (hình vuông này có kích thước không cố định, n là số ký tự của mỗi cạnh hình vuông, n được nhập vào từ bàn phím):
package buoi2;

import java.util.Scanner;

public class bai19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhap so nguyen duong n=");
			n = input.nextInt();
		} while (n < 1);
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if ((i == 1) || (i == n) || (j == 1) || (j == n))
					System.out.print("A");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		input.close();
	}
}
