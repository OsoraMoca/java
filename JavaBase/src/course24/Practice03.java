package course24;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("足し算する？引き算する？");
		System.out.println("1：足し算 2：引き算");
		int i = stdIn.nextInt();
		
		System.out.println("1つ目の数字を入れてね");
		int a = stdIn.nextInt();
		
		System.out.println("2つ目の数字を入れてね");
		int b = stdIn.nextInt();
		
		if (i == 1) {
			plus(a , b);
		} else if(i == 2) {
			minus(a , b);
		}
		
	}
	
	//足し算
	static void plus(int x , int y) {
		System.out.println(x + "+" + y + "=" + (x + y));
	}
	//引き算
	static void minus(int x , int y) {
		System.out.println(x + "-" + y + "=" + (x - y));
	}

}
