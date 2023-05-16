package baitaplan3;

import java.util.Scanner;

public class bài1 {
	public static void main(String[] args) {
		
		double result =bài1.product (3,2,5,1,2);
		System.out.println(result);

	}
	

	public static double product(double... arr) {
		double result = 1;
		for (double e : arr) {
			result = result * e;
		}
		return result;

	}

}