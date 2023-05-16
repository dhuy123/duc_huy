package baitaplan3;

import java.util.Scanner;

public class bai2 {
	public static boolean checkMostPalindrome(String s) {
		int count = 0;
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				count++;
			}
		}
		return count == 1;
	}

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//double checkMostPalindrome = sc.nextDouble();
		boolean result = bai2.checkMostPalindrome("abcbba");
		System.out.println(result);
	}

}
