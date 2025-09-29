package buoi2;

public class Bai34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Đoạn code 1:
		
			for (int i = 1; i <= 10; i++) {
				if (i > 6) {
					break;
				}
				System.out.print(i);
			}
		
	//Đoạn code 2:
		
			for (int i = 1; i <= 10; i++) {
				if (i > 6) {
					continue;
				}
				System.out.print(i);
			}
			// break dừng hẳn vòng lặp còn continue thoát khỏi vòng lặp hiện tại và chuyển qua vòng lặp kế tiếp
		

	}

}
