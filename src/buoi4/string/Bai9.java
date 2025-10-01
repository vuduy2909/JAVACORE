/* 9.	Hãy code các ví dụ cho việc tạo ra chuỗi mới bằng cách: 
Chuỗi = Chuỗi + Số
Chuỗi = Số + Chuỗi
Chuỗi = (Biểu thức toán học) + Chuỗi
Chuỗi = Chuỗi + (Biểu thức toán học)
Chuỗi = (Biểu thức logic) + Chuỗi
*/
package buoi4.string;

public class Bai9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input ="Hello";
		String s1 = input +123;
		System.out.println(s1);
		String s2 = 456 + input;
		System.out.println(s2);
		String s3 = (4+5) + input;
		System.out.println(s3);
		String s4 = input + 7*7;
		System.out.println(s4);
		String s5 =(7>3)+input;
		System.out.println(s5);
		
	}

}
