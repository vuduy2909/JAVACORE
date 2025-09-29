//37.	In dãy số 2, 4, -6, 8, 10, -12 … n (bằng 2 cách khác nhau) (n là số được nhập vào từ bàn phím) (*)
//Nhap so nguyen duong n=37
//2 4 -6 8 10 -12 14 16 -18 20 22 -24 26 28 -30 32 34 -36 37
package buoi2;

import java.util.Scanner;

public class Bai37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhap so nguyen duong n=");
			n = input.nextInt();
		} while (n < 1);
		for (int i=2;i<=n;i+=2) {
			if (i%3==0) System.out.print(-1*i+" ");
			else System.out.print(i+" ");
		}
		if (n%2==1) System.out.print(n);// neu nhap n la so le
	}

}
