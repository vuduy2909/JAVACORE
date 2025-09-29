//17.	Viết chương trình tính:
//S = 1+1/2!+1/3!+…..+1/n!                    (Số n được nhập từ bàn phím)
//		Gợi ý: sử dụng 2 vòng lặp for lồng nhau.

package buoi2;

import java.util.Scanner;

public class bai18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhap so nguyen duong n=");
			n = input.nextInt();
		} while (n < 0);
		double sum=0;
		for (int i=1;i<=(2*n-1);i+=2) {
			long factorial =1;
			for (int j=1;j<=i;j++) {			
				factorial *= j;
			}
			sum += (1.0/factorial);
		}
		System.out.printf("Tong sum lam tron la: %.2f",sum);
		input.close();
	}

}
