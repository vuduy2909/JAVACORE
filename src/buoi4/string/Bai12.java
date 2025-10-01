//12.	Cho 2 chuỗi (String) a và b nhập vào từ bàn phím. Hãy so sánh chuỗi nào lớn hơn. (quan trọng)
package buoi4.string;

import java.util.Scanner;

public class Bai12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		String a,b="";
		System.out.print("Nhap chuoi a:");
		a=sc.nextLine();
		System.out.print("Nhap chuoi b:");
		b=sc.nextLine();
		long result = a.compareTo(b);
		if (result>0) System.out.println("chuoi a lon hon b ");
		else if (result< 0) System.out.println("chuoi a nho hon b");
		else System.out.println("chuoi a bang chuoi b");
		
	}

}
