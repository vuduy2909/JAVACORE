//13.	Tính tổng và tích các chữ số của một số m, m được nhập từ bàn phím:
//			(Ví dụ : m = 234 => S = 2 + 3 + 4 = 9, P = 2 * 3 * 4 = 24)
package buoi2;

import java.util.Scanner;


public class bai13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		long m,sum=0;
		double product=1;
		
		do {
			System.out.print("Nhap so nguyen duong m = ");
			m = input.nextInt();
		} while (m <= 0);
		while (m > 0) {
			
			sum += m%10;
			product *= m%10;
			m /= 10;	
		}
		System.out.println(sum);
		System.out.println(product);
		input.close();
	}

}
