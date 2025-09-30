package buoi3.ham;
import java.util.*;
public class Bai6 {
    static String nv1, nv2, nv3, nv4, nv5; // mỗi nhân viên = 1 chuỗi
    static Scanner sc = new Scanner(System.in);

    public static void nhap(int stt) {
        System.out.print("Nhap ho ten: ");
        String fullName = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        int age = sc.nextInt(); sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        boolean gender = sc.nextBoolean();
        System.out.print("Nhap luong: ");
        float salary = sc.nextFloat();
        System.out.print("Nhap diem TB: ");
        float GPA = sc.nextFloat(); sc.nextLine();

        String infor = fullName + " - " + age + " - " + (gender ? "Nam" : "Nu") + " - " + salary + " - " + GPA;

        switch (stt) {
            case 1: nv1 = infor; break;
            case 2: nv2 = infor; break;
            case 3: nv3 = infor; break;
            case 4: nv4 = infor; break;
            case 5: nv5 = infor; break;
        }
    }

    public static void xuat(int stt) {
        switch (stt) {
            case 1: System.out.println("NV1: " + nv1); break;
            case 2: System.out.println("NV2: " + nv2); break;
            case 3: System.out.println("NV3: " + nv3); break;
            case 4: System.out.println("NV4: " + nv4); break;
            case 5: System.out.println("NV5: " + nv5); break;
        }
    }

    public static void main(String[] args) {
        System.out.print("Nhap so nhan vien (<=5): ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nNhap thong tin nhan vien " + i + ":");
            nhap(i);
        }

        System.out.println("\n=== DANH SACH NHAN VIEN ===");
        for (int i = 1; i <= n; i++) {
            xuat(i);
        }
    }
}