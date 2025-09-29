package buoi2;

import java.util.Scanner;

public class Bai35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n;
		String binary = "";
		do {
			System.out.print("Nhap so nguyen duong n=");
			n = input.nextInt();
		} while (n < 1);
        int temp = n;

        while (temp > 0) {
            int r = temp % 2;     // lấy dư
            binary = r + binary;        // ghép ngược vào chuỗi
            temp = temp / 2;      // chia tiếp
        }

        System.out.println("Số nhị phân: " + binary);
	}

}
