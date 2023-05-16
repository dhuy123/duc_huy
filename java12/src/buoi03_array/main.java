package buoi03_array;

import java.util.Arrays;

public class main {
public static void main(String[] args) {
	int a[]=new int[] {2,4,6,8};
	int b[]=a.clone(); //tạo ra bản sao của a 
	//gán cho b ,h tương tác với b thì a ko ảnh hưởng
	//b[1]=10;
	//arrays.toString() :in ra toàn bộ mảng
	System.out.println(Arrays.toString(b=a));
	System.out.println(Arrays.toString(a));
	
}
}
