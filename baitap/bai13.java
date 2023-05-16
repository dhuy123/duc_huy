package baitap;

import java.util.Scanner;

public class bai13 {
	public static void main(String[] args) {
		Scanner pT = new Scanner(System.in);
		System.out.println("nhập vào 3 số nguyên a b c:");
		int a = pT.nextInt();
		int b = pT.nextInt();
		int c = pT.nextInt();
		System.out.println("phương trình bậc 2 :" + a + "x^2" + "+x" + b + "+" + c + "=0");
		double dental = ((b * b) - 4 * a * c);
		System.out.println("dental=" + dental);
		double x = -b / (2 * a);
		double x1 = (-b + Math.sqrt(dental)) / 2 * a;
		double x2 = (-b - Math.sqrt(dental)) / 2 * a;
		if (dental < 0) {
			System.out.println("no solution");
		} else if (dental == 0) {
			System.out.println("phương trình có nghiệm kép");
			System.out.println("x=" + x);
		} else {
			System.out.println("phuong trình có 2 nghiệm phân biệt");
			System.out.println("x1=" + x1);
			System.out.println("x2=" + x2);
		}

	}

}
