package baitaplan2;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		System.out.println("nhập chuỗi :");
		String s1 = str.nextLine();
		System.out.println(s1.length());
		String s2 = "";
		s2=str.nextLine();
		
			{int i;
			for (i = s1.length() - 1; i >= 0; i--){
				;

			s2 = s2 + s1.charAt(i);
			System.out.println(s2);
		}}
		if (s1.equals(s2)) {
			System.out.println("this is a palindrome");
		} else {
			System.out.println("this is not a palindrome");
		}

	}
}
