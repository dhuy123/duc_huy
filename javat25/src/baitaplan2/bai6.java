package baitaplan2;

import java.util.Scanner;

public class bai6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("nhap mang:");
		int n1 = 0;
		int tmp1;

		System.out.println("nhập số phần tử ");
		n1 = sc.nextInt();
		System.out.println("nhập phần tử  ");
		int array1[];
		array1 = new int[n1];
		for (int i = 0; i < n1; i++)
			array1[i] = sc.nextInt();
		for (int i = 0; i < n1; i++)
			System.out.print(array1[i] + ",");
		// tìm SLN
		tmp1 = array1[0];
		for (int i = 1; i < n1; i++) {
			if (tmp1 < array1[i])
				tmp1 = array1[i];
		}

		System.out.println("số lớn nhất " + tmp1);
		{int n2 = 0;
		int tmp2;

		System.out.println("nhập số phần tử ");
		n2 = sc.nextInt();
		System.out.println("nhập phần tử  ");
		int array2[];
		array2 = new int[n2];
		for (int i = 0; i < n2; i++)
			array2[i] = sc.nextInt();
		for (int i = 0; i < n2; i++)
			System.out.print(array2[i] + ",");
		// tìm SLN
		tmp2 = array2[0];
		for (int i = 1; i < n2; i++) {
			if (tmp2 < array2[i])
				tmp2 = array2[i];
		}

		System.out.println("số lớn nhất " + tmp2);

		
		{int n3 = 0;
		int tmp3;

		System.out.println("nhập số phần tử ");
		n3 = sc.nextInt();
		System.out.println("nhập phần tử  ");
		int array3[];
		array3 = new int[n3];
		for (int i = 0; i < n3; i++)
			array3[i] = sc.nextInt();
		for (int i = 0; i < n3; i++)
			System.out.print(array3[i] + ",");
		// tìm SLN
		tmp3 = array3[0];
		for (int i = 1; i < n3; i++) {
			if (tmp3 < array3[i])
				tmp3 = array3[i];
		}

		System.out.println("số lớn nhất " + tmp3);

    System.out.println(+tmp1+","+tmp2+","+tmp3);}

		}
	}
}