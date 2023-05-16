package baitap;
import java.util.Scanner;
public class bai1 {
	public static void main(String [] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("giờ:");
		int gio=sc.nextInt();
		System.out.print("phút:");
		int phut=sc.nextInt();
		System.out.print("giây:");
		int giay=sc.nextInt();
		System.out.println("--------");
		System.out.println("tổng số giây là:"+((gio*60*60)+(phut*60)+giay));
		sc.close();
		
	}

}
