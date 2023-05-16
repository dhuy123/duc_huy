package baitap;

import java.util.Scanner;
import java.Math;


public class bai8 {
	public static void main(String[] args) {

		Scanner tamgiac = new Scanner(System.in);
		System.out.print("nhập vào 3 cạnh tam giác");
		
			int a = tamgiac.nextInt();
			System.out.println("a=" + a);
			int b = tamgiac.nextInt();
			System.out.println("b=" + b);
			int c = tamgiac.nextInt();
			System.out.println("c=" + c);

			int chuVi;
			chuVi = (a + b + c);
			System.out.print("chu vi tam giác là :" + chuVi );
			double p=(chuVi*0.5);
			double dienTich=Math.sqrt(p*(p-a)*(p-b)*(p-c));
			System.out.println("dien tich tam giac la:"+dienTich);
		

	}

}
