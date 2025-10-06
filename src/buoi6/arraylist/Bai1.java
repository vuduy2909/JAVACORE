package buoi6.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        // a. Nhập ArrayList
        System.out.print("Nhập số lượng phần tử n: ");
        int n = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();   
        System.out.println("Nhập các phần tử của ArrayList:");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            a.add(value);
        }
        // b.	In giá trị của các phần tử a.
        System.out.println("Các phần tử của ArrayList:");
        for (int value : a) {     
            System.out.print(value + " ");                   
        }
        System.out.println(); 
        // c. Đếm số lượng số lẻ
        int countOdd = 0;
        for (int value : a) {  // 
            if (value % 2 != 0) {
                countOdd++;
            }
        }
        System.out.println("Số lượng số lẻ trong ArrayList: " + countOdd);
        int sumOddPositive = 0;
        for (int value : a) {   // duyệt qua ArrayList bằng vòng for each
            if (value % 2 != 0 && value > 0) {
                sumOddPositive += value;
            }
        }
        System.out.println("Tổng các số dương lẻ trong ArrayList: " + sumOddPositive);
        
        // e. Tìm k trong ArrayList
        System.out.print("Nhập số k: ");
        int k = scanner.nextInt();
        boolean found = false;   
        ArrayList<Integer> positions = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {     
            if (a.get(i) == k) {
                found = true;
               positions.add(i);  
			}
        }
        if (found) {
            System.out.println("Số " + k + " xuất hiện tại các vị trí: " + positions);
        } else {
            System.out.println("Số " + k + " không xuất hiện trong ArrayList.");
        }
        
        // f. Tìm giá trị lớn nhất và nhỏ nhất
        int max = Collections.max(a);
        int min = Collections.min(a);
        System.out.println("Giá trị lớn nhất trong ArrayList: " + max);
        System.out.println("Giá trị nhỏ nhất trong ArrayList: " + min);

        // g. Xóa các phần tử có giá trị k
        a.removeIf(value -> value == k);
        System.out.println("ArrayList sau khi xóa các phần tử có giá trị " + k + ": " + a);

        // h. Chèn phần tử vào vị trí k
        System.out.print("Nhập giá trị cần chèn: ");
        int newValue = scanner.nextInt();
        System.out.print("Nhập vị trí cần chèn (0-" + (a.size()) + "): ");
        int position = scanner.nextInt();
        if (position >= 0 && position <= a.size()) {
           a.add(position, newValue);  // Chèn vào vị trí position của a 1 value là newValue.
            System.out.println("ArrayList sau khi chèn: " + a);
        } else {
            System.out.println("Vị trí chèn không hợp lệ.");
        }
        // i. Kiểm tra tính đối xứng

        boolean isSymmetric = true;   // dùng kỹ thuật sử dụng CỜ HIỆU
        for (int i = 0; i < a.size() / 2; i++) {
            if (!a.get(i).equals(a.get(a.size() - 1 - i))) {
                isSymmetric = false;
                break;
            }
        }
        if (isSymmetric) {
            System.out.println("ArrayList là đối xứng.");
        } else {
            System.out.println("ArrayList không đối xứng.");
        }

        // j. Đảo thứ tự các phần tử
        Collections.reverse(a);
        System.out.println("ArrayList sau khi đảo thứ tự: " + a);
        scanner.close();

        // k. Sắp xếp ArrayList a theo thứ tự tăng dần
        Collections.sort(a);

    


	}

}
