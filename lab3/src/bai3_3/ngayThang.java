package bai3_3;
import java.util.Scanner;

public class ngayThang extends hangThucPham {
	private 
	int ngay;
	int thang;
	int nam;

public void ngaySanXuat() {
	
}
public void ngayHetHan() {}
		
public void nhapnt(){
     Scanner sc=new Scanner (System.in);
     System.out.print("nhap ngay");
     ngay=sc.nextInt();
     System.out.print("nhap thang");
     thang=sc.nextInt();
     System.out.print("nhap nam");
     nam=sc.nextInt();
     
     }
public void xuat() {
	System.out.println("ngay:"+ngay+"thang:"+thang+"nam:"+nam);
	
}
public static void main(String[] args) {
	ngayThang sx=new ngayThang();
	System.out.println("nhập ngày Sản Xuất:");
	sx.ngaySanXuat();
	sx.nhap();
	ngayThang hh=new ngayThang();
	System.out.println("nhập ngày hết hạn:");
	hh.ngayHetHan();
	hh.nhap();
	System.out.println("ngày sản xuất:");
	sx.xuat();
	System.out.println("ngày hết hạn:");
	hh.xuat();
}
}

