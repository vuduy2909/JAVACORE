//36.	Viết chương nhập vào một số nguyên a. Sau đó kiểm tra số nguyên a này có phải là số nguyên dương hay không (tức là kiểm tra xem a > 0 hay không).
//Nếu a không phải là số nguyên dương thì chương trình hãy yêu cầu người dùng nhập lại a cho đến khi nào a là số nguyên dương thì thôi.
//Sau khi nhập được a > 0 rồi thì thông báo “Đã nhập thành công”. (*)
package buoi2;

import java.util.Scanner;

public class Bai36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner input = new Scanner(System.in);
		int  a;
		System.out.print("Nhap so nguyen duong a=");
		a = input.nextInt();
		while(a<0){
			System.out.print("Nhap lai so nguyen duong a=");
			a = input.nextInt();	
		}
		do {
			System.out.print("Nhap so nguyen duong a=");
			a = input.nextInt();
			
		} while (a < 0);
		System.out.print("Đã nhập thành công");
	}
}
