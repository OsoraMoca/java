package course19;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {

		//⑤
		int[] numArray = new int[3];
		numArray[0] = 10;
		numArray[1] = 11;
		numArray[2] = 12;

		for (int i = numArray[0]; i <= numArray[2]; i++) {
			System.out.println(i);
		}

		//⑥
		Scanner stdIn = new Scanner(System.in);

		int[] numArray2 = new int[stdIn.nextInt()];

	}

}
