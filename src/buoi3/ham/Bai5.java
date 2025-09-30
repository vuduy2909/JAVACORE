package buoi3.ham;

import java.util.Scanner;

public class Bai5 {

    static String fullName;
    static int age;
    static boolean gender;
    static float salary;  
    static double GPA;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		nhap();
		xuat();

	}
	public static void nhap() {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Nhap ho ten: ");
	    fullName = sc.nextLine();
	    System.out.print("Nhap tuoi: ");
	    age = sc.nextInt();
	    System.out.print("Nhap gioi tinh (true = nam, false = nu): ");
	    gender = sc.nextBoolean();
	    System.out.print("Nhap luong: ");
	    salary = sc.nextFloat();
	    System.out.print("Nhap diem GPA: ");
	    GPA = sc.nextDouble();
		
	}
	public static void xuat() {
	    System.out.println("\n--- Thong tin vua nhap ---");
	    System.out.println("Ho ten: " + fullName);
	    System.out.println("Tuoi: " + age);
	    System.out.println("Gioi tinh: " + (gender ? "Nam" : "Nu"));
	    System.out.println("Luong: " + salary);
	    System.out.println("GPA: " + GPA);
	}

}
