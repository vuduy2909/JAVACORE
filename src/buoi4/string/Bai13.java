//13.	Cho chuỗi a và chuỗi b. Hãy kiểm tra xem chuỗi b có phải là con của chuỗi a hay không?
//(Gợi ý: sử dụng hàm indexOf hoặc hàm contains, nên thử cả 2 hàm cho biết)
package buoi4.string;

import java.util.Scanner;

public class Bai13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		String a,b="";
		System.out.print("Nhap chuoi a:");
		a=sc.nextLine();
		System.out.print("Nhap chuoi b:");
		b=sc.nextLine();
		boolean bang=a.contains(b);
		
		if (bang) {
			System.out.println("b la chuoi con cua a");
		} else System.out.println("b khong phai la chuoi con cua a");
		int bang1 = a.indexOf(b);
		if (bang1 !=-1) {
			System.out.println("b la chuoi con cua a");
		} else System.out.println("b khong phai la chuoi con cua a");
	}

}
