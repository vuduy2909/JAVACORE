/*
 Chai sữa giá a đồng, sử dụng rồi bán lại được b đồng.
 Nếu có c đồng thì mua được hết bao nhiêu chai sữa.
 */
package buoi3.ham;
import java.util.Scanner;
public class Bai9 {
	static long a, b, c, soChai = 0;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nhap();
		long count = soChaiSua(a, b, c);
		System.out.printf("Tong so chai sua co the mua: %d", count);
	}
	public static long soChaiSua(long a, long b, long c) {
		while (c >= a) {
			c -= a;
			c += b;
			soChai++;
		}
		return soChai;
	}
	public static void nhap() {
		System.out.print("Nhap so tien mua 1 chai sua a=");
		a = sc.nextLong();
		System.out.print("Nhap so tien ban 1 chai sua rong b=");
		b = sc.nextLong();
		System.out.print("Nhap so tien c =");
		c = sc.nextLong();
	}
}
