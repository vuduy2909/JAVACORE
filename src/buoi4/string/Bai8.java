//8.	Cho chuỗi “Hello” và chuỗi “World”  Hãy tạo thành chuỗi “ Hello World ” bằng 2 cách khác nhau.
package buoi4.string;

public class Bai8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 ="Hello";
		String s2 ="World";
		System.out.println(s1+" "+s2);
		System.out.println(s1.concat(" ").concat(s2));
	   
	}

}
