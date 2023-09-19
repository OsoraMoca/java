package course19;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		
		//①
		String[] mygroup = new String[3];
		mygroup[0] = "ふじひら";
		mygroup[1] = "いの";
		mygroup[2] = "さかもと";

		//②
		int[] mygroupnum = new int[3];
		mygroupnum[0] = 24;
		mygroupnum[1] = 3;
		mygroupnum[2] = 10;
		
		//③
		int[] myNum = new int[3];
		myNum[0] = 10;
		myNum[1] = 50;
		myNum[2] = myNum[0] + myNum[1];		
		System.out.println(myNum[2]);
		
		//④
		int[] myNumScan = new int[3];
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("数字を打ってちょ");
		myNumScan[0] = 10;
		myNumScan[1] = stdIn.nextInt();
		myNumScan[2] = myNumScan[0] + myNumScan[1];	
		System.out.println(myNumScan[2]);
		
	}

}
