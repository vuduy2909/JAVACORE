package buoi3.ham;
import java.util.*;
public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int a = nhapSo("a", sc);
        int b = nhapSo("b", sc);
        int c = nhapSo("c", sc);
		 System.out.println("USCLN của " + a + ", " + b + ", " + c + " = " + gcd3(a, b, c));

	}

	public static int gcd(int x,int y) {
		int r;
		while(y!=0) {
		r =x%y;
		x=y;
		y=r;
		}
		return x;
		
	}
	public static int gcd3(int a,int b,int c ) {
		return gcd(gcd(a,b),c);
	}
    public static int nhapSo(String ten, Scanner sc) {
        int x;
        do {
            System.out.print("Nhap " + ten + " = ");
            x = sc.nextInt();
        } while (x < 1);
        return x;
    }

	
}
