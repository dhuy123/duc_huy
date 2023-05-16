package baitap;

import java.util.Scanner;

public class bai7 {
	public static void main(String[] args) {
		Scanner doi = new Scanner(System.in);
		System.out.print("nhập số nguyên n:");
		int n = doi.nextInt();

		float doC=((float)(n * 1.8 + 32));

		System.out.println(+n+"C="+doC+"F");

		float doF=((float)((n -32)/1.8));

		System.out.println(+n+"F="+doF+"C");

	}

}
