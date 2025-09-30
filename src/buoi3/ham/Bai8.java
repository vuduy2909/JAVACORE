package buoi3.ham;

import java.util.Scanner;

public class Bai8 {

	static String nv1, nv2, nv3, nv4, nv5, infor; // mỗi nhân viên = 1 chuỗi
	static Scanner sc = new Scanner(System.in);
	static int n;

	public static void nhap() {

		int count = 0;
		while (count < 5) {
			nhapNhanVien(count + 1);
			count++;
			System.out.print("Ban co muon nhap tiep khong? (Yes/No): ");
			String ans = sc.nextLine();
			if (ans.equals("No")||ans.equals("no"))
				break;
		}
		n = count; // lưu lại số nhân viên thực tế

	}

	public static void nhapNhanVien(int stt) {
		System.out.print("Nhap ho ten: ");
		String fullName = sc.nextLine();
		System.out.print("Nhap tuoi: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap gioi tinh: ");
		boolean gender = sc.nextBoolean();
		System.out.print("Nhap luong: ");
		float salary = sc.nextFloat();
		System.out.print("Nhap diem TB: ");
		float GPA = sc.nextFloat();
		sc.nextLine();

		infor = fullName + " - " + age + " - " + (gender ? "Nam" : "Nu") + " - " + "Luong:" + salary + " - " + "GPA:"
				+ GPA;

		switch (stt) {
		case 1:
			nv1 = infor;
			break;
		case 2:
			nv2 = infor;
			break;
		case 3:
			nv3 = infor;
			break;
		case 4:
			nv4 = infor;
			break;
		case 5:
			nv5 = infor;
			break;
		}
	}

	public static void xuat() {
		for (int i = 1; i <= n; i++) {
			xuatNhanVien(i);
		}
	}

	public static void xuatNhanVien(int stt) {
		switch (stt) {
		case 1:
			System.out.println("NV1: " + nv1);
			break;
		case 2:
			System.out.println("NV2: " + nv2);
			break;
		case 3:
			System.out.println("NV3: " + nv3);
			break;
		case 4:
			System.out.println("NV4: " + nv4);
			break;
		case 5:
			System.out.println("NV5: " + nv5);
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		nhap();
		System.out.println("\n=== DANH SACH NHAN VIEN ===");
		xuat();

	}

}
