package baitaplan2;

import java.util.Scanner;

public class bai4 {public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("nhập chuỗi:");
   
   
    String str =sc.nextLine();
	String[] arr = str.split(" ");
	//System.out.println(str.split(""));
	String result = "";
	for(int i = 0; i < arr.length; i++) {
		String tmp = arr[i].toLowerCase();
		//System.out.println(arr[i].toLowerCase());
		result = result + (char)(tmp.charAt(0) + 32) + tmp.substring(1, tmp.length());
		//System.out.println((char)(tmp.charAt(0) + 32));
		if(i != arr.length - 1) {
			result = result + " ";
		}
}
	System.out.println(result);
	

}

}
