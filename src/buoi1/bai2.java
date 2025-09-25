package buoi1;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap so :");
		float number = in.nextFloat();
		System.out.printf("So da nhap sau khi nhan 2 la: %.2f", number*2);
		in.close();
	}

}
