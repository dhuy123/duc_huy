package baitaplan3;

public class bai3 {
	public static boolean checkAlphabet(String s){
		for (int i=0;i<s.length();i++) {
		if (!((s.charAt(i)>='a'&& s.charAt(i)<='z')||(s.charAt(i)>='A')&&(s.charAt(i)<='Z'))){
			return false;
		}
	}
	return true;	
	}
	public static void main(String[] args) {
		boolean result =bai3.checkAlphabet("nguyenduchuy");
		System.out.println(result);
		
		
	} 

}
