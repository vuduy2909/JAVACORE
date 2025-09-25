package buoi1;

import java.util.Scanner;

public class bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Nhap a: ");
        Scanner input = new Scanner(System.in);
        Double a = input.nextDouble();
        
        System.out.print("Nhap b: ");
        Double b = input.nextDouble();
        System.out.print("Nhap c: ");
        Double c = input.nextDouble();
        Double delta =b*b - 4*a*c;
        if (delta >0) {
        	System.out.println("Phuong trinh co 2 nghiem");
        	Double x1 = (-b + Math.sqrt(delta))/2*a;
        	Double x2 = (-b - Math.sqrt(delta))/2*a;
        	System.out.printf("Nghiem thu nhat: %.2f\n",x1);
        	System.out.printf("Nghiem thu hai: %.2f\n",x2);
        	
        }
        else if (delta == 0) {
        	System.out.println("Phuong trinh co nghiem kep");
        	Double x = -b/2*a;
        	System.out.printf("Nghiem kep la: %.2f\n",x);
        
        }
        else System.out.println("Phuong trinh vo nghiem ");
	}

}
