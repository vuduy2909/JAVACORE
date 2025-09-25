package buoi1;

public class bai8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Đoạn 1:
		int a = -5;
		if (a > 0)
			System.out.println("a lớn hơn 0");
		System.out.println("a >  0");
        // In ra a > 0. Sai.Đoạn này chạy lệnh đầu tiên sau điều kiện if, 
		//nếu không có cặp dấu {} thì thực hiện câu lệnh ngay sau if
		// Đoạn 2:
		a = -5;
		if (a > 0) {
			System.out.println("a lớn hơn 0");
		}
		System.out.println("a >  0");
		// Vẫn in ra a>0. Vì dấu {} không chứa dòng lệnh System.out.println("a > 0");
		// nên nó luôn chạy
		// Đoạn 3:
		a = -5;
		if (a > 0) {
			System.out.println("a lớn hơn 0");
			System.out.println("a >  0");
		}
		// Đúng. Sẽ không in ra gì cả.

	}

}
