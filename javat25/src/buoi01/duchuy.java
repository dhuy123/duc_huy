package buoi01;
import java.util.Scanner;
public class duchuy {
	public static void main (String[] args ) {
		Scanner sc=new Scanner (System.in);
		System.out.println("nhập chuỗi a:");
		String a=sc.next();
		System.out.println("chuỗi của a là :"+a);
//	String str="nguyen duc huy";
//		System.out.println(str.startsWith("n"));
//		System.out.println(str.substring(4, 8));
//		System.out.println(str.repeat(0));
//		Integer a=new Integer(10);
//		Integer b=new Integer(10);
//		System.out.println(a==b);
		
		int[][] c = {{1, 2}, { 3, 4}, { 3, 4}, { 3, 4}};
		// khởi tạo mảng 2 chiều bằng vòng lặp for
		int[][] b = new int[4][2];
		for (int i = 0; i < 4; i++) {
		    for (int j = 0; j < 2; j++) {
		        b[i][j] = i;}}
		        System.out.println(c);
	}

}
