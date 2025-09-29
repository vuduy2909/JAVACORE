package buoi2;

import java.util.Scanner;

public class Bai39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int  n;
		do {
			System.out.print("Nhap so nguyen duong n=");
			n = input.nextInt();
		} while (n < 1);
		for (int j = 1; j <= n; j++) {
			if (j % 2 != 0) {
				System.out.print("A");
			} else {
				System.out.print("B");
			}
		}
		// đoạn for có 1 câu lệnh if.
		

	}

}
