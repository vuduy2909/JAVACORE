package buoi3.ham;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        double a = nhapSo("a", sc);
        double b = nhapSo("b", sc);
        double c = nhapSo("c", sc);
        long cong2so=congPhanNguyen(a,b);
        long cong3so=congPhanNguyen(a,b,c);
        System.out.println(cong2so);
        System.out.println(cong3so);
		
	}

    public static float nhapSo(String ten, Scanner sc) {
        float x;
        do {
            System.out.print("Nhap " + ten + " = ");
            x = sc.nextFloat();
        } while (x < 1);
        return x;
    }
    public static long congPhanNguyen(double a, double b) {
        return (long)Math.floor(a) + (long)Math.floor(b);
    }


    public static long congPhanNguyen(double a, double b, double c) {
        return (long)Math.floor(a) + (long)Math.floor(b) + (long)Math.floor(c);
    }
}
