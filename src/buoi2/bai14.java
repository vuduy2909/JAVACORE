package buoi2;
import java.util.Scanner;
public class bai14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long a,b;
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("Nhap a=");
			a = input.nextInt();
			System.out.print("Nhap b=");
			b = input.nextInt();
		} while ((a < 0)||(b<0));
	int USCLN=1;

	for (int i=1;i<=Math.min(a,b);i++) {
		if ((a%i==0)&&(b%i==0)) {
			USCLN=i;
		}
	}
	System.out.println(USCLN);
	System.out.print(a*b/USCLN);
	input.close();
	}
	
}
