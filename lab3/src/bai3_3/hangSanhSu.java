package bai3_3;

import java.util.Scanner;

public class hangSanhSu extends hangHoa {
	private hangHoa hangSanhSu;
	String loaiNguyenLieu;
	hangSanhSu() {
		super();
		
	}
	public void nhapnl() {
		Scanner sc=new Scanner (System.in);
	    System.out.print("nhập loại nguyên liệu:");
	    loaiNguyenLieu=sc.nextLine();
	}
	public String toString (){
		return "loại nguyên liệu :"+loaiNguyenLieu;
	}
	public static void main(String[] args) {
		hangSanhSu s=new hangSanhSu();
		s.nhap();
		s.nhapnl();
		System.out.println("thông tin sản phẩm:");
		s.xuat();
		System.out.println(s.toString());
		
	}
	

}
