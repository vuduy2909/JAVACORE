//10.	In dãy số 1, 2, 3, 5, 8, 13, …n (n là số được nhập vào từ bàn phím) bằng vòng lặp while.
//Input : n =46
//output: 1 2 3 5 8 13 21 34 46
// Quy luật giống dãy Fibonaci

package buoi2;
import java.util.Scanner;
public class bai10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("Nhap n=");
			n = input.nextInt();
		} while (n < 2);
		int f0 = 1, f1 = 2, fn = 0;
		System.out.print("1 2 ");
		while (fn < n) {
			fn = f0 + f1;
			f0 = f1;
			f1 = fn;
			if (fn < n) {
				System.out.print(fn + " ");
			} else {
				System.out.print(n);
			}
			// Trường hợp nhập n bất kì không thuộc dãy Fibonaci thì in số Fibonaci trước n rồi in n
		}
		input.close();
	}

}
