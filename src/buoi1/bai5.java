package buoi1;
import java.util.Scanner;
public class bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Nhap a: ");
		Scanner input = new Scanner(System.in);
		Double a = input.nextDouble();
		System.out.print("Nhap b: ");
		Double b = input.nextDouble();
		Double c = -b / a;
		if (a == 0) {
			System.out.printf("pt bac 1 nay vo nghiem\n");
		} else if (b == 0) {
			System.out.printf("pt bac 1 nay co vo so nghiem");
		} else {
			System.out.printf("pt bac 1 nay co nghiem la: %.2f\n", c);
		}
		input.close();
	}

}
//5.	Giải phương trình bậc 1 (ax + b = 0), a và b là 2 số thập phân được nhập vào từ bàn phím