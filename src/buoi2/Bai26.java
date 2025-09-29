package buoi2;

import java.util.Scanner;

public class Bai26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		*
		**
		***
		****
		*****
		*/

		Scanner input = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhap so nguyen duong n=");
			n = input.nextInt();
		} while (n < 1);
		int i = 1, j = 1;
		while (i <= n) {
			j = 1;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
		}
	}

}
