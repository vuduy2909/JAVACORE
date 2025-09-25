package buoi1;

public class bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float a = 1;
		float b = 2;
		
		System.out.println("Gia tri ban dau: a = " + a + ", b = " + b);
		System.out.printf("Gia tri ban dau: a = %.2f , b = %.2f\n",a,b);
		a +=b;
		System.out.printf("a da thay doi thanh: %.2f %.2f\n", a,b);
		b -=a;
		System.out.printf("b da thay doi thanh: %.2f %.2f\n",a,b);
		a *=b;
		System.out.printf("a da thay doi thanh: %.2f %.2f\n",a,b);
		b /=a;
		System.out.printf("b da thay doi thanh: %.2f %.2f\n",a,b);
		a++;
		System.out.printf("a++ da thay doi thanh: %.2f %.2f\n",a,b);
		b--;
		System.out.printf("b-- da thay doi thanh: %.2f %.2f\n",a,b);
		++a;
		System.out.printf("++a da thay doi thanh: %.2f %.2f\n",a,b);
		//a dang la -1.
		System.out.printf("a da thay doi thanh: %.2f\n",a++); //in ra a =-1 rồi mới cộng 1 , lúc này a = 0
		System.out.printf("a da thay doi thanh: %.2f\n",++a); // a đang bằng 0, tăng 1 thì a=1 rồi in a=1
		
		--b;
		System.out.printf("--b da thay doi thanh: %.2f %.2f\n",a,b);

	}

}

/*7.	Cho giá trị ban đầu của a và b là: a = 1, b = 2. 
Tính giá trị của a và b sau khi thực hiện các biểu thức sau:
a += b; a=3 b=2
b -=a; a=3 b=-1
a *=b; a=-3 b=-1
b /=a; a=-3 b= 3
a++; in ra -3 rồi mới cộng 1, a=-2
b--; in ra 3 rồi mới trừ 1, b=2
++a; cộng 1 rồi mới in ra a =-2 
--b; trừ 1 rồi mới in ra b =1
*/
