package buoi5.mang1chieu;

import java.util.Scanner;

public class Bai2 {

	static String nv1, nv2, nv3, nv4, nv0, infor; // mỗi nhân viên = 1 chuỗi
	static Scanner sc = new Scanner(System.in);
	static int n, i = 0;
	static String[] fullName = new String[5];
	static int[] age = new int[5];
	static boolean[] gender = new boolean[5];
	static double[] salary = new double[5];
	static double[] GPA = new double[5];

	public static void nhap() {

		while (i < 5) {
			nhapNhanVien(i);
			i++;
			System.out.print("Ban co muon nhap tiep khong? (Yes/No): ");
			String ans = sc.nextLine();
			if (ans.equals("No") || ans.equals("no"))
			{
				
				break;
				
				}
			
		}
		n = i; // lưu lại số nhân viên thực tế

	}

	public static void nhapNhanVien(int stt) {

		System.out.print("Nhap ho ten: ");
		fullName[i] = sc.nextLine();
		System.out.print("Nhap tuoi: ");
		age[i] = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap gioi tinh: ");
		gender[i] = sc.nextBoolean();
		sc.nextLine();
		System.out.print("Nhap luong: ");
		salary[i] = sc.nextDouble();
		sc.nextLine();
		System.out.print("Nhap diem TB: ");
		GPA[i] = sc.nextDouble();
		sc.nextLine();

		infor = fullName[i] + " - " + age[i] + " - " + (gender[i] ? "Nam" : "Nu") + " - " + "Luong:" + salary[i] + " - "
				+ "GPA:" + String.format("%.2f", GPA[i]);

		switch (stt) {
		case 0:
			nv0 = infor;
			break;
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
		}
	}

	public static void xuat() {
		for (int i = 0; i < n; i++) {
			xuatNhanVien(i);
		}
	}

	public static void xuatNhanVien(int stt) {
		switch (stt) {
		case 0:
			System.out.println("NV0: " + nv0);
			break;
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
		}
	}

	public static void findMaxGPA(double GPA[], String[] fullName) {
	    double max = GPA[0];
	    double max2 = Double.MIN_VALUE;

	    // Tìm max và max2
	    for (int i = 0; i < n; i++) {
	        if (GPA[i] > max) {
	            max2 = max;
	            max = GPA[i];
	        } else if (GPA[i] > max2 && GPA[i] != max) {
	            max2 = GPA[i];
	        }
	    }

	    // In ra nhân viên có GPA cao nhất và cao nhì
	    for (int j = 0; j < n; j++) {
	        if (GPA[j] == max) {
	            System.out.println("Nhân viên có GPA cao nhất: " + fullName[j] + " (" + String.format("%.2f", GPA[j]) + ")");
	        } else if (GPA[j] == max2) {
	            System.out.println("Nhân viên có GPA cao nhì: " + fullName[j] + " (" + String.format("%.2f", GPA[j]) + ")");
	        }
	    }
	}


	public static void findByFullName(String fullName[]) {
		System.out.print("Ban co muon tim kiem chinh xac khong? (Yes/No): ");
		String ans = sc.nextLine();

		while (ans.equalsIgnoreCase("Yes")) {
			System.out.print("Hãy nhập chính xác h�? tên ngư�?i cần tìm: ");
			String name = sc.nextLine();
			int count =0;
			for (int i = 0; i <n; i++) {
				if (fullName[i].equals(name)) {
					System.out.println("Có nhân viên này");
					xuatNhanVien(i);
					count++;
				} 			
			}
			if (count==0) System.out.println("Khong co nhan vien nay");
			System.out.print("Ban co muon tiep tuc tim kiem khong? (Yes/No): ");
			ans = sc.nextLine();
		}
		
	}
	public static void findByName(String fullName[]) {
		System.out.print("Ban co muon tim kiem theo ten khong? (Yes/No): ");
		String ans = sc.nextLine();
		int count =0;
		while (ans.equalsIgnoreCase("Yes")) {
			System.out.print("Hãy nhập  tên ngư�?i cần tìm: ");
			String name = sc.nextLine();
			for (int i = 0; i < n; i++) {
				if (fullName[i].contains(name)) {
					System.out.println("Có nhân viên này");
					xuatNhanVien(i);
					count++;
				} 
				if (count==0)System.out.println("Khong co nhan vien nay");
			}
			System.out.print("Ban co muon tiep tuc tim kiem khong? (Yes/No): ");
			ans = sc.nextLine();
		}
		
	}
	public static void sortByAge() {
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = i + 1; j < n; j++) {
	            if (age[i] > age[j]) {

	                int tmpAge = age[i];
	                age[i] = age[j];
	                age[j] = tmpAge;

	                String tmpName = fullName[i];
	                fullName[i] = fullName[j];
	                fullName[j] = tmpName;

	                boolean tmpGender = gender[i];
	                gender[i] = gender[j];
	                gender[j] = tmpGender;
	              
	                double tmpSalary = salary[i];
	                salary[i] = salary[j];
	                salary[j] = tmpSalary;
	         
	                double tmpGPA = GPA[i];
	                GPA[i] = GPA[j];
	                GPA[j] = tmpGPA;
	            }
	        }
	    }
	    System.out.println("Danh sach nhan vien tang dan theo do tuoi");
	    xuat();
	}


	public static void main(String[] args) {

		nhap();
		System.out.println("\n=== DANH SACH NHAN VIEN ===");
		xuat();
		findMaxGPA(GPA,fullName);
		findByFullName(fullName);
		findByName(fullName);
		sortByAge();
		System.out.println("Chương trình kết thúc");

	}

}
