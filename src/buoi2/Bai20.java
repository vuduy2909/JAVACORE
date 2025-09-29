
//20.	Viết chương trình in ra hình vuông với những chữ A và những chữ B (hình vuông này có kích thước không cố định, n là số ký tự của mỗi cạnh hình vuông, n được nhập vào từ bàn phím):
//Ví dụ nếu người dùng nhập n = 5, thì chương trình sẽ hiển thị hình vuông là:
package buoi2;

import java.util.Scanner;

public class Bai20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhap so nguyen duong n=");
			n = input.nextInt();
		} while (n < 1);
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i % 2 == 1)
					System.out.print("A");
				else
					System.out.print("B");
			}
			System.out.println();
			
		}
		input.close();
	}

}
