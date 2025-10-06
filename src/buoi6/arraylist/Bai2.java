package buoi6.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai2 {

	static Scanner sc = new Scanner(System.in);

	// Thay mảng tĩnh bằng ArrayList
	static ArrayList<String> fullName = new ArrayList<>();
	static ArrayList<Integer> age = new ArrayList<>();
	static ArrayList<Boolean> gender = new ArrayList<>();
	static ArrayList<Double> salary = new ArrayList<>();
	static ArrayList<Double> GPA = new ArrayList<>();

	static int n = 0; // số nhân viên thực tế

	public static void nhap() {
		String ans;
		do {
			System.out.print("Nhap ho ten: ");
			String name = sc.nextLine();

			System.out.print("Nhap tuoi: ");
			int tuoi = sc.nextInt();
			sc.nextLine();

			System.out.print("Nhap gioi tinh (true=Nam/false=Nu): ");
			boolean gt = sc.nextBoolean();
			sc.nextLine();

			System.out.print("Nhap luong: ");
			double luong = sc.nextDouble();
			sc.nextLine();

			System.out.print("Nhap diem TB: ");
			double gpa = sc.nextDouble();
			sc.nextLine();

			// Thêm vào ArrayList
			fullName.add(name);
			age.add(tuoi);
			gender.add(gt);
			salary.add(luong);
			GPA.add(gpa);

			n++;

			System.out.print("Ban co muon nhap tiep khong? (Yes/No): ");
			ans = sc.nextLine();
		} while (ans.equalsIgnoreCase("Yes"));
	}

	public static void xuat() {
		for (int i = 0; i < n; i++) {
			System.out.println(
					"NV" + i + ": " + fullName.get(i) + " - " + age.get(i) + " - " + (gender.get(i) ? "Nam" : "Nu")
							+ " - Luong:" + salary.get(i) + " - GPA:" + String.format("%.2f", GPA.get(i)));
		}
	}

	// a. Tìm nhân viên có GPA cao nhất, cao nhì
	public static void findMaxGPA() {
		if (n < 2) {
			System.out.println("Chua du nhan vien de tim max2");
			return;
		}

		double max = GPA.get(0);
		double max2 = Double.MIN_VALUE;

		// tìm max và max2
		for (int i = 0; i < n; i++) {
			if (GPA.get(i) > max) {
				max2 = max;
				max = GPA.get(i);
			} else if (GPA.get(i) > max2 && GPA.get(i) != max) {
				max2 = GPA.get(i);
			}
		}

		// in kết quả
		for (int i = 0; i < n; i++) {
			if (GPA.get(i) == max) {
				System.out.println(
						"Nhân viên GPA cao nhất: " + fullName.get(i) + " (" + String.format("%.2f", GPA.get(i)) + ")");
			} else if (GPA.get(i) == max2) {
				System.out.println(
						"Nhân viên GPA cao nhì: " + fullName.get(i) + " (" + String.format("%.2f", GPA.get(i)) + ")");
			}
		}
	}

	// b. Tìm theo họ tên chính xác
	public static void findByFullName() {
	    String ans;
	    do {
	        System.out.print("Nhap ho ten chinh xac can tim: ");
	        String name = sc.nextLine();
	        boolean found = false;

	        for (int i = 0; i < n; i++) {
	            if (fullName.get(i).equalsIgnoreCase(name)) {
	                System.out.println("Có nhân viên này:");
	                System.out.println("NV" + i + ": " + fullName.get(i) + " - " + age.get(i) + " - "
	                        + (gender.get(i) ? "Nam" : "Nu") + " - Luong:" + salary.get(i)
	                        + " - GPA:" + String.format("%.2f", GPA.get(i)));
	                found = true;
	            }
	        }

	        if (!found) {
	            System.out.println("Không có nhân viên này");
	        }

	        System.out.print("Bạn có muốn tiếp tục tìm kiếm không? (Yes/No): ");
	        ans = sc.nextLine();

	    } while (ans.equalsIgnoreCase("Yes"));
	}


	// b. Tìm theo tên gần đúng (contains)
	public static void findByName() {
	    String ans;
	    do {
	        System.out.print("Nhap ten can tim (mot phan): ");
	        String name = sc.nextLine();
	        boolean found = false;

	        for (int i = 0; i < n; i++) {
	            if (fullName.get(i).toLowerCase().contains(name.toLowerCase())) {
	                System.out.println("Có nhân viên này:");
	                System.out.println("NV" + i + ": " + fullName.get(i) + " - " + age.get(i) + " - "
	                        + (gender.get(i) ? "Nam" : "Nu") + " - Luong:" + salary.get(i)
	                        + " - GPA:" + String.format("%.2f", GPA.get(i)));
	                found = true;
	            }
	        }

	        if (!found) {
	            System.out.println("Không có nhân viên này");
	        }

	        System.out.print("Bạn có muốn tiếp tục tìm kiếm không? (Yes/No): ");
	        ans = sc.nextLine();

	    } while (ans.equalsIgnoreCase("Yes"));
	}


	// c. Sắp xếp theo tuổi tăng dần
	public static void sortByAge() {
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (age.get(i) > age.get(j)) {
					// đổi chỗ các phần tử song song
					Collections.swap(fullName, i, j);
					Collections.swap(age, i, j);
					Collections.swap(gender, i, j);
					Collections.swap(salary, i, j);
					Collections.swap(GPA, i, j);
				}
			}
		}

		System.out.println("\nDanh sach nhan vien tang dan theo tuoi:");
		xuat();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		nhap();
		System.out.println("\n=== DANH SACH NHAN VIEN ===");
		xuat();
		findMaxGPA();
		findByFullName();
		findByName();
		sortByAge();
		System.out.println("Chuong trinh ket thuc");
	}

}
