package baitaplan2;

import java.util.Scanner;

public class bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhập vào 2 số nguyên a b:");

		int a = sc.nextInt();
		int b = sc.nextInt();

		for (int i = a; i <= b; i++) {

			if (i % 400 == 0)
				if (i % 4 == 0 && i % 100 != 0) 
					System.out.print(i + ",");
				}

		
	}
}
