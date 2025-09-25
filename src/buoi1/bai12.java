package buoi1;

import java.util.Scanner;

public class bai12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.print("Nhap so a :");
		int a = in.nextInt();
		System.out.println("Ban da nhap a=" + a);
		System.out.print("Nhap so b :");
		int b = in.nextInt();
		System.out.println("Ban da nhap b=" + b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("a da thay doi thanh a =" + a);
		System.out.println("b da thay doi thanh b =" + b);

	}

}
