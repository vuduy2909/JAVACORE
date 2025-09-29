package buoi2;

import java.util.Scanner;

public class Bai25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int i = 1, j, n;
		do {
			System.out.print("Nhap so nguyen duong n=");
			n = input.nextInt();
		} while (n < 1);
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++) {
				System.out.println(i + " - " + j);
			}
		}
		System.out.println();
		i = 1;
		while (i <= n) {
			j = 1;
			while (j <= n) {
				System.out.println(i + " - " + j);
				j++;
			}
			i++;
		}
		;

	}

}
