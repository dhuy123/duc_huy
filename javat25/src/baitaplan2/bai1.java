package baitaplan2;

import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		
		Scanner max = new Scanner(System.in);
			System.out.print("nhập vào 2 số nguyên a b");
		int a = max.nextInt();
		System.out.println("a=" + a);
		int b = max.nextInt();
		System.out.println("b=" + b);

		int ucln=0;
		for ( int i = 1; i <= a && i <=b; i++) {
			if (a % i == 0 && b % i == 0) {
				ucln= i;
			}
		}

		System.out.println("ước chung lớn nhất là:"+ucln);}}
