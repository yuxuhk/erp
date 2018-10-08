package Test;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// 判断是否为闰年
		while (true) {
			Scanner sc = new Scanner(System.in);
			int year = sc.nextInt();
			if (year % 4 == 0 && year % 100 != 0) {
				System.out.println("闰年");
			} else if (year % 400 == 0) {
				System.out.println("闰年");
			} else {
				System.out.println("不是闰年");
			}
		}
	}
}
