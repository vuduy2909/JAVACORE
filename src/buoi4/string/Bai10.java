/*10.	Nhập vào một String S,  thực hiện công việc sau:
a.	In ra màn hình String đảo ngược của S
b.	Đổi toàn bộ kí tự của S sang chữ Hoa
c.	Đổi toàn bộ kí tự của S sang chữ thường
d.	Đưa ra bảng tần số xuất hiện của các kí tự trong S (*)
e.	Trích ra chuỗi con của S từ kí tự thứ n đến thứ m của S (n, m nhập từ bàn phím) */

package buoi4.string;

import java.util.*;

public class Bai10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = "";
		System.out.print("Nhap chuoi:");
		input = sc.nextLine();
		// cau a
		String reverse = new StringBuilder(input).reverse().toString();
		System.out.println(reverse);
		// cau b
		System.out.println(input.toUpperCase());
		// cau c
		System.out.println(input.toLowerCase());
		// cau d
		String check = "";
		for (int i = 0; i <= input.length() - 1; i++) {
			char c = input.charAt(i);
			if (check.indexOf(c) == -1) {
				long count = 0;
				for (int j = 0; j <= input.length() - 1; j++) {
					if (input.charAt(j) == c) {
						count++;
					}

				}
				System.out.println("So lan xuat hien cua ki tu " + c + " la: " + count);
				check += c;

			}
		}
		int n,m;
		System.out.print("Nhap n:");
		n=sc.nextInt();
		System.out.print("Nhap m:");
		m=sc.nextInt();
		String con = input.substring(n,m);
		System.out.println(con);
	}
}
