package buoi02;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//next() in ra 1 từ trong chuỗi ko tính dấu cách
//nextLine () in ra cả câu có dấu cách
//		char =' ';
//		char ='\u0000';//là ký tự rỗng
//		System.out.println((int)a);
//		System.out.println((int)b);
//		
		/*
		 * tình huống 1 nhập chuỗi trước nhập chuỗi sau
		 * "le dao tan thanh\u000"-nextLine()-"le..." ko so dữ liệu thừa
		 * tình huống 2 nhập số trước nhập chuỗi sau
		 * "24\u000"-nextInt() 24 có dữ liệu thừa là \u000
		 * nên phải kèm sc.nextLine();
		 */
//		System.out.print("nhập tên ");
//		String name =sc.nextLine();
//		System.out.print("nhập tuoi");
//		int age=sc.nextInt();
//		System.out.print("ten la"+name);
//		System.out.print("tuoi la"+age);
//		
//		
//		sc.close();
	}
}
