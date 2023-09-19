package course03;

public class Sample01 {

	public static void main(String[] args) {
		//変数に文字列や数値を格納する。
		String hensu = "Java";
		int hensu1 = 100 + 100;
		String hensu2 = "100 + 100";
		
		//変数の中身を表示する。
		System.out.println(hensu);
		System.out.println(hensu1);
		System.out.println(hensu2);
		
		//変数の値を上書きする。
		int hensu3 = 3000;
		hensu3 =1000;
		//変数の中身を表示する。
		System.out.println(hensu3);
		
		//変数同士を計算する。(数値)
		int hensu4 = 1500;
		int hensu5 = 3000;
		int hensu6 = hensu4 + hensu5;
		System.out.println(hensu6);
		
		//変数同士を計算する。(文字列)
		String hensu7 = "国際";
		String hensu8 = "理工";
		String hensu9 = hensu7 + hensu8;
		System.out.println(hensu9);
		
		//変数の文法
		//変数は「変数の型 変数名 = 値」と書く。
		//例えば「int abc = 100」のように書く。
		//intは変数の型、abcは変数名、100は値
		
		int ABC = 50;
		System.out.println(ABC);
				
	}

}