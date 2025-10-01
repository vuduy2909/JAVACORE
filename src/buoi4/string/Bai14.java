//14.	Cho 2 chuỗi a và b. Hãy kiểm tra xem 2 chuỗi đó có bằng nhau không (Gợi ý: sử dụng hàm equals)
package buoi4.string;

import java.util.Scanner;

public class Bai14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		String a,b="";
		System.out.print("Nhap chuoi a:");
		a=sc.nextLine();
		System.out.print("Nhap chuoi b:");
		b=sc.nextLine();
		boolean bang = a.equals(b);
		if (bang) {
			System.out.println("2 chuoi bang nhau");
		} else System.out.println("2 chuoi khac nhau");
		
	}

}
