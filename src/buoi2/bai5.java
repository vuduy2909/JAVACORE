package buoi2;

import java.util.Scanner;

public class bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;

		do {
			System.out.print("Nhap so nguyen duong n = ");
			n = input.nextInt();
		} while (n <= 0);
		double sum=0;
		for(int i=1;i<=n;i++) {
			sum +=(1.0/i);
		}
		System.out.printf("%.2f",sum);
	}

}
