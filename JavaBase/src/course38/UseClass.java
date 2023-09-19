package course38;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {

		Pocketon poke1 = new Pocketon();

		poke1.name = "銭カメ";
		poke1.power = 100;
		poke1.difficult = 1;

		Pocketon poke2 = new Pocketon();

		poke2.name = "不思議リーフ";
		poke2.power = 200;
		poke2.difficult = 3;
		
		String[] arr2 = { "あ", "か", "さ" };

		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);

		Pocketon[] myPockes = new Pocketon[3];

		myPockes[0] = poke1;
		myPockes[1] = poke2;
		
		System.out.println(myPockes[0].name);
		
		System.out.println(myPockes[1].difficult);
		
		Pocketon poke3 = new Pocketon();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("name");
		poke3.name = stdIn.next();
		System.out.println("power");
		poke3.power = stdIn.nextInt();
		System.out.println("difficult");
		poke3.difficult = stdIn.nextInt();
		
		myPockes[2] = poke3;
		
		System.out.println(myPockes[2].name);
		System.out.println(myPockes[2].power);
		System.out.println(myPockes[2].difficult);
		
		for (int i = 0; i < myPockes.length; i++) {
			System.out.println(myPockes[i].name);
		}
		
		myPockes[1].display();

	}

}
