package buoi1;
import java.util.*;
public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.print("Nhap so :");
		int number = in.nextInt();
		System.out.printf("Ban da nhap so:%d\n",number);
		if (number%2 == 0) 
		{
			System.out.printf("Ban da nhap so CHAN");	
		}
		else
		{
			System.out.printf("Ban da nhap so LE");	
		}	
	}

}
