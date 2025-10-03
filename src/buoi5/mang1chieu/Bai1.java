/*
 1.	Viết chương trình thực hiện các công việc như sau :
a.	Nhập một mảng 1 chiều tên gọi là a gồm n phần tử kiểu nguyên int.
b.	In gia�? trị của ca�?c phần tử  của a.
c.	�?ê�?m sô�? lượng phần tử lẻ co�? trong mảng a.
d.	Tính tổng số dương lẻ của mảng a.
e.	Nhập vào phần tử k, tìm xem k có xuất hiện trong mảng a không. Nếu có chỉ ra các vị trí của k trong mảng. (*)
f.	Sắp sếp mảng a theo thứ tự tăng dần.
g.	�?ảo thư�? tự ca�?c phần tử của mảng a (để a co�? thư�? tự ngược lại. �?ảo nội dung mảng chư�? không phải in ra theo thư�? tự ngược lại).
h.	Xo�?a ca�?c phần tử trong mảng a co�? gia�? trị k được nhập vào từ bàn phi�?m. (*)
i.	Chèn 1 phần tử vào vị tri�? k bâ�?t kỳ (lưu y�?: cần xo�?a bơ�?t phần tử cuô�?i cùng).
j.	Tìm gia�? trị lơ�?n nhâ�?t và nhỏ nhâ�?t của mảng a. (Theo 2 ca�?ch: ca�?ch 1 dùng 2 vòng for. Ca�?ch 2 dùng 1 vòng for).
k.	Tìm gia�? trị lơ�?n nhì của mảng a. (Theo 2 ca�?ch: ca�?ch 1 dùng 2 vòng for. Ca�?ch 2 dùng 1 vòng for). (*)
l.	Kiểm tra xem mảng a co�? phải là mảng đô�?i xư�?ng hay không. Giả định sô�? lượng phần tử của mảng luôn là sô�? lẻ.
Vd: Mảng sau là mảng đô�?i xư�?ng {1, 2, 4, 7, 3, 7, 4, 2, 1}  đô�?i xư�?ng qua phần tử ở giữa.
m.	�?ê�?m sô�? cặp sô�? đô�?i xư�?ng trong mảng. Sô�? lượng phần tử của mảng luôn là sô�? lẻ.
Vd: Mảng sau {1, 2, 8, 7, 3, 7, 4, 2, 1} co�? 3 cặp sô�? đô�?i xư�?ng  đô�?i xư�?ng qua phần tử ở giữa.
 */
package buoi5.mang1chieu;

import java.util.*;

public class Bai1 {

	static Scanner sc = new Scanner(System.in);
	static int n;
	// static int[] a = new int[n];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Nhap n:");
		n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			System.out.printf("Nhap a[%d]:", i);
			a[i] = sc.nextInt();
		}

		printArray(a);
		int count_odd = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1)
				count_odd++;

		}
		System.out.println("So phan tu le trong manng la:" + count_odd);
		long sum_odd = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1 && a[i] > 0)
				sum_odd += a[i];

		}
		System.out.println("Tong so duong le trong mang la:" + sum_odd);
		System.out.print("Nhap k=");
		int k = sc.nextInt();
		int count_k = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == k) {
				System.out.printf("k xuat hien tai vi tri %d \n", i);
				count_k++;
			}
			;
		}
		if (count_k == 0)
			System.out.println("Mang khong chua phan tu co gia tri k");

	
		bubbleSort(a);
		printArray(a);
		reverseArray(a);
		deleteElement(a, n);
		insertElement(a, n);
		printArray(a);
		findMinMax(a);
		findSecondMax(a);
		if (isSymmetric(a)) System.out.println("Day la mang doi xung");
		int symPair =countSymPairs(a);
		System.out.println("Số cặp sô�? đô�?i xư�?ng"+symPair);

	}
	public static void bubbleSort(int[]a) {
		int[] newArr =a.clone();
		for (int i = 0; i < newArr.length - 1; i++) { 
			for (int j = 0; j < newArr.length - i - 1; j++) { 
				if (newArr[j] > newArr[j + 1]) {
					int temp =newArr[j];
					newArr[j] = newArr[j + 1];
					newArr[j + 1] = temp;
				}
			}
		}
		printArray(newArr);
	}

	public static void printArray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("a[%d]:%d \n", i, a[i]);
		}
	}

	public static void reverseArray(int a[]) {
		int[] newArr =a.clone();
		int left = 0, right = newArr.length - 1;

		while (left < right) {
			int temp = newArr[left];
			newArr[left] = newArr[right];
			newArr[right] = temp;
			left++;
			right--;
		}

		System.out.println("Mang dao:");
		printArray(newArr);

	}

	public static void deleteElement(int a[], int n) {
		System.out.print("Nhap gia tri k de xoa phan tu:");
		int k = sc.nextInt();
		int[] newArr = new int[n];
		for (int i = 0, j = 0; i < a.length; i++) {
			if (a[i] == k)
				continue;
			newArr[j++] = a[i];
		}
		printArray(newArr);
	}

	public static void insertElement(int a[], int n) {
		System.out.print("Nhap vi tri k de them phan tu:");
		int k = sc.nextInt();
		System.out.print("Nhap gia tri k:");
		int value = sc.nextInt();
		int[] newArr = a.clone();
		for (int i = newArr.length - 1; i > k; i--) {
			newArr[i] = newArr[i - 1];
		}
		newArr[k] = value;
		printArray(newArr);
	}

	public static void findMinMax(int[] a) {
		int max = a[0];
		int min = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}

		System.out.println("Max = " + max + ", Min = " + min);
		max = a[0];
		min = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
			if (a[i] < min)
				min = a[i];
		}
	}

	public static void findSecondMax(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}

		int max2 = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] != max && a[i] > max2) {
				max2 = a[i];
			}
		}

		System.out.println("So lon nhi: " + max2);
		max = a[0];
		max2 = a[0];

		for (int x : a) {
			if (x > max) {
				max2 = max;
				max = x;
			} else if (x > max2 && x != max) {
				max2 = x;
			}
		}

		System.out.println("So lon nhi: " + max2);
	}

	public static boolean isSymmetric(int[] a) {
		int left = 0, right = a.length - 1;
		while (left < right) {
			if (a[left] != a[right]) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static int countSymPairs(int[] a) {
		int count = 0;
		int left = 0, right = a.length - 1;

		while (left < right) {
			if (a[left] == a[right]) {
				count++;
			}
			left++;
			right--;
		}
		return count;
	}

}
