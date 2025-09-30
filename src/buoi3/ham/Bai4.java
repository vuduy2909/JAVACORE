package buoi3.ham;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
	
		float a = nhapSo("a",sc);

		float b = nhapSo("b",sc);
		long product1 =nhan2so((long) a, (long) b);
		float product2 =nhan2so(a, b);	
		System.out.println(product1);
		System.out.println(product2);
	}
	public static long nhan2so(long a, long b) {
		return a*b;
	}
	public static float nhan2so(float a, float b) {
		return a*b;
	}
    public static float nhapSo(String ten, Scanner sc) {
        float x;
        do {
            System.out.print("Nhap " + ten + " = ");
            x = sc.nextFloat();
        } while (x < 1);
        return x;
    }

}
