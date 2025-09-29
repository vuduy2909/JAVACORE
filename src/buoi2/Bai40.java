package buoi2;

import java.util.Scanner;

public class Bai40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int  n;
		do {
			System.out.print("Nhap so nguyen duong n=");
			n = input.nextInt();
		} while (n < 1);
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.println(i + " " + j);
			}
		}

		for (int i = 1; i <= 5; i++)
			for (int j = 1; j <= 5; j++)
				System.out.println(i + " " + j);
		//Vì ở đoạn 1 trong dấu {} chỉ có 1 câu lệnh, ở các câu lệnh vòng lặp, nếu không dùng {} để nhóm
		// các câu lệnh thì vòng lặp sẽ thực hiện câu lệnh đầu tiên trong vòng lặp.
		// Ở 2 đoạn này, vì trong vòng for chỉ có 1 câu lệnh nên kq mới giống, nếu vòng for có nhiều lệnh mà kh dùng {} sẽ cho ra kq khác nhau

	}

}
