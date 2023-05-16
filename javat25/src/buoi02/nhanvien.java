package buoi02;

import java.util.Scanner;

public class nhanvien {
	private String ma, ten, ngaysinh;
	private double luong;

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap ma nhan vien :");
		ma = sc.next();
		sc.nextLine();
		System.out.print("nhap ten nhan vien:");
		ten = sc.nextLine();
		System.out.print("nhap ngay sinh nhan vien :");
		ngaysinh = sc.next();
		System.out.print("nhap luong nhan vien :");
		luong = sc.nextDouble();

	}

	public void xuat() {
		System.out.println("\tdanh sách nhan vien \t");
		System.out.println("ma \t" + "ten \t\t" + "ngay sinh \t" + "luong \t");
		System.out.println(ma + "\t" + ten + "\t" +ngaysinh + "\t" + luong);
	}

	public static void main(String[] args) {
		Scanner nv = new Scanner(System.in);
		int n;// so nhanvien
		nhanvien dsnhanvien[];// khai bao mang nhanvien
		System.out.println("nhap số lượng nhân viên");
		n = nv.nextInt();
		nhanvien dsnhavien[] = new nhanvien[n];// cấp phat mảng
		for (int i = 0; i <= n; i++) {
		dsnhanvien[i] = new nhanvien();
		dsnhanvien[i].nhap();
		}
		System.out.println("danh sachsau khi nhap là :");
	     {for (int i = 0; i <= n; i++) 
			System.out.println("dsnhanvien" + dsnhanvien[i]);}
	     
	}

}
