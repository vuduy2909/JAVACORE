//3.	Cho chuỗi “Hello World”  Đếm xem có bao nhiêu chữ l (*) (Gợi ý: sử dụng hàm charAt() của String)
package buoi4.string;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Hello World";
		int count = 0;
		for (int i = 0; i <= 10; i++) {
			if (input.charAt(i) == 'l') {
				count++;
			}
		}
		System.out.println(count);
	}

}
