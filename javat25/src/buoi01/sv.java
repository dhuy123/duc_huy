package buoi01;

import java.util.Scanner;

public class sv {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("nhap so phan tư mảng ");
			n = sc.nextInt();
		} while (n < 0);
		int[] a = new int[n];
		System.out.println("nhap gia trị");
		for (int i = 0; i < n ; i++) {
			
			a[i] = sc.nextInt();
			System.out.println("a[" + i + "]" + "=" + a[i]);
		
		}
		System.out.println("các phần tử của mảng là");
		
		for (int i = 0; i <a.length; i++)
			System.out.print(a[i]+"");
	}

}
