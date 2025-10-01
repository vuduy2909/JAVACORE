/* 11.	Thực hiện các việc chuyển đổi sau:
•	Chuyển đổi String thành int trong java
•	Chuyển đổi int thành String trong java
•	Chuyển đổi String thành long trong java
•	Chuyển đổi long thành String trong java
•	Chuyển đổi String thành float trong java
•	Chuyển đổi float thành String trong java
•	Chuyển đổi String thành double trong java
•	Chuyển đổi double thành String trong java
•	Chuyển đổi String thành short trong java
•	Chuyển đổi short thành String trong java
•	Chuyển đổi String thành Date trong java
*/
package buoi4.string;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Bai11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "8386";
		int n = Integer.parseInt(str);
		System.out.println(n);
		int m = 4950;
		String str1 = Integer.toString(m);
		System.out.println(str1);
		String str2 = "1000";
		long a = Long.parseLong(str2);
		System.out.println(a);
		long b = 2000;
		String str3 = Long.toString(b);
		System.out.println("Chuoi:" + str3);
		String str4 = "345.6";
		float c = Float.parseFloat(str4);
		System.out.println(c);
		System.out.println(Float.toString(c));
		String str5 = "567867.d";
		double d = Double.parseDouble(str5);
		System.out.println(d);
		System.out.println(Double.toString(d));
		String str6 = "30000";
		short e = Short.parseShort(str6);
		System.out.println(e);
		System.out.println(Short.toString(e));
		String strDate = "2025-10-01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date dateValue = sdf.parse(strDate);
			System.out.println("String → Date: " + dateValue);
		} catch (ParseException h) {
			h.printStackTrace();
		}
	}

}
