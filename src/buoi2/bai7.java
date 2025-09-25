//Tính giai thừa của số n (n là số được nhập vào từ bàn phím) bằng cách sử dụng vòng lặp for.
package buoi2;

import java.util.*;

public class bai7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n;
		do {
			System.out.println("Nhap so nguyen duong n=");
			n = input.nextInt();

		}

		while (n < 0);

		long product =1;
		for (int i=1;i<=n;i++) {
			product *= i;
		}
		
	}
}
