package buoi2;

import java.util.Scanner;

public class Bai27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int i = 1, j, k, n;
		do {
			System.out.print("Nhap so nguyen duong n=");
			n = input.nextInt();
		} while (n < 1);
		/*
		   *    
		  ***
		 *****
		*******
		*/
		while (i <= n) {
			j = 1;
			while (j <= n - i) {
				System.out.print(" ");
				j++;
			}
			k = 1;
			while (k <= 2 * i - 1) {
				System.out.print("*");
				k++;
			}
			i++;
			System.out.println();
		}

	}

}
