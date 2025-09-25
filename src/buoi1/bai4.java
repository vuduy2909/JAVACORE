package buoi1;

import java.util.*;

public class bai4 {
    public static void main(String[] args) {
        System.out.print("Nhap ban kinh hinh tron: ");
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double chuvi = 2 * Math.PI * r;
        System.out.printf("Chu vi hinh tron la: %.2f%n",chuvi);   
        double dientich = Math.PI * r * r;
        System.out.printf("Dien tich hinh tron la: %.2f%n", dientich);  
    }
}
