package buoi3.ham;
import java.util.Scanner;
public class Bai10 {

	static long n;
	static float sum=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so n=");
		n= sc.nextLong();	
		System.out.printf("Tong la: %.10f ",sum(n));
	}
	public static long factorial(long n) {
		if ((n==0)||(n==1)) return 1;
		return n*factorial(n-1);
	}
	public static float sum(long n) {
		for (int i=2;i<=2*n;i+=2) {
			sum += 1.0/factorial(i);
		}
		return sum;
	}
}
