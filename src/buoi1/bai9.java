package buoi1;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap a = ");
        int a = input.nextInt();

        // =======================
        // Cách 1: Dùng if liên tiếp
        // =======================
        
		/*
		 * if (a == 1) { System.out.println("One"); } if (a == 2) {
		 * System.out.println("Two"); } if (a == 3) { System.out.println("Three"); } if
		 * (a == 4) { System.out.println("Four"); } if (a == 5) {
		 * System.out.println("Five"); }
		 */

        // =======================
        // Cách 2: Dùng if + else if
        // =======================
        if (a == 1) {
            System.out.println("One");
        } else if (a == 2) {
            System.out.println("Two");
        } else if (a == 3) {
            System.out.println("Three");
        } else if (a == 4) {
            System.out.println("Four");
        } else if (a == 5) {
            System.out.println("Five");
        } else {
            System.out.println("Ban khong nhap so hop le");
        }

        // =======================
        // Cách 3: Dùng if lồng nhau
        // =======================
        if (a == 1) {
            System.out.println("One");
        } else {
            if (a == 2) {
                System.out.println("Two");
            } else {
                if (a == 3) {
                    System.out.println("Three");
                } else {
                    if (a == 4) {
                        System.out.println("Four");
                    } else {
                        if (a == 5) {
                            System.out.println("Five");
                        } else {
                            System.out.println("Ban khong nhap so hop le");
                        }
                    }
                }
            }
        }

        // =======================
        // Cách 4: Dùng switch-case
        // =======================
        switch (a) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Ban khong nhap so hop le");
        }

        input.close();
    }
}
