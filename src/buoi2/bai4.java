package buoi2;

import java.util.Scanner;

public class bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;

		do {
			System.out.print("Nhap so nguyen duong n = ");
			n = input.nextInt();
		} while (n <= 0);
		long sum=0;
		for(int i=1;i<=n;i++) {
			sum +=i;
		}
		System.out.print(sum);
	}

}
