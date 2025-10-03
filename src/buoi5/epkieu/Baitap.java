/*
1.	Cho các ví dụ về ép kiểu mà độ chính xác không bị thay đổi, như thứ tự bên dưới: 
byte⤍short⤍int⤍long⤍float⤍double

2.	Cho các ví dụ về ép kiểu mà độ chính xác không bị thay đổi, như thứ tự bên dưới: 
double⤍float⤍long⤍int⤍short⤍byte

3.	Cho các ví dụ về ép kiểu mà độ chính xác bị thay đổi, như thứ tự bên dưới: 
double⤍float⤍long⤍int⤍short⤍byte

4.	Phân biệt ép kiểu tường minh và ép kiểu ngầm định
ép kiểu ngầm định do java khi gán 1 giá trị có kích thước từ nhỏ đến lớn
ép kiểu tường định do dev định nghĩa khi gán 1 giá trị có kích thước từ lớn về nhỏ. có nguy cơ mất mát dữ liệu
5.	Khi nào cần dùng các ký tự L, F, D… sau các số nguyên, số thực trong Java? Khi nào thì không cần dùng đến các ký tự này mà Java vẫn tự hiểu được các số thuộc kiểu dữ liệu gì?
dùng L,F khi khai báo các số nguyên số thực không có phần thập phân, khi đó Java ngầm hiểu là int nên phải có đuôi LF, còn khi khai báo double thì java đã ngầm hiểu số thực là double nên kh cần dùng đuôi d
*/

package buoi5.epkieu;

public class Baitap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bai1();
		bai2();
		bai3();

		}

	public static void bai1() {
		byte b = 100; // 1 byte
		short s = b; // byte -> short
		int i = s; // short -> int
		long l = i; // int -> long
		float f = l; // long -> float
		double d = f; // float -> double

		System.out.println("byte: " + b);
		System.out.println("short: " + s);
		System.out.println("int: " + i);
		System.out.println("long: " + l);
		System.out.println("float: " + f);
		System.out.println("double: " + d);
	}
	public static void bai2(){
        double d = 123.0;       // double
        float f = (float) d;    // double -> float
        long l = (long) f;      // float -> long
        int i = (int) l;        // long -> int
        short s = (short) i;    // int -> short
        byte b = (byte) s;      // short -> byte

        System.out.println("double: " + d);
        System.out.println("float: " + f);
        System.out.println("long: " + l);
        System.out.println("int: " + i);
        System.out.println("short: " + s);
        System.out.println("byte: " + b);
	}
	public static void bai3() {
        double d = 123.45678999;  // double
        float f = (float) d;    // mất độ chính xác phần thập phân
        long l = (long) f;      // mất phần thập phân
        int i = (int) l;        // có thể giữ được
        short s = (short) i;    // có thể bị tràn
        byte b = (byte) s;      // chắc chắn tràn nếu vượt -128..127

        System.out.println("double: " + d);
        System.out.println("float: " + f);
        System.out.println("long: " + l);
        System.out.println("int: " + i);
        System.out.println("short: " + s);
        System.out.println("byte: " + b);
	}
}
