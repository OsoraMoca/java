package course10;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("a打って");
		int a = stdIn.nextInt();
		
		if(a > 0) {
			if(a % 2 == 0)
				System.out.println("偶数");
			else
				System.out.println("奇数");
		}
	}

}
