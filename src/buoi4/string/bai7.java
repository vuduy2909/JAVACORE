//7.	Cho chuỗi “Hello World”  Đảo chuỗi thành dlroW olleH
package buoi4.string;

public class bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello World";
		String reversed1 = new StringBuilder(s).reverse().toString();
		System.out.println(reversed1); // "dlroW olleH"
		String reversed2="";
		for (int i=s.length()-1;i>=0;i--) {
			reversed2 += s.charAt(i);
		}
		System.out.println(reversed2);

	}

}
