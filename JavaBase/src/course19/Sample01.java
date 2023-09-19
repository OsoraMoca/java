package course19;

public class Sample01 {

	public static void main(String[] args) {
		
		String a = "やすだ";
		String b = "さかもと";
		String c = "ふじひら";
		String d = "おれ";
		String e = "いの";
		String f = "すずき";
		String g = "いとうのこうせい";
		String h = "かけがわ";
		
		//配列の鉄板構文
		//[]ことを要素と呼ぶ。要素は0から始まる。
		String[] nameList = new String[10];
		nameList[0] = "やすだ";
		nameList[1] = "さかもと";
		nameList[2] = "ふじひら";
		nameList[3] = "おれ";
		nameList[4] = "いの";
		nameList[5] = "すずき";
		nameList[6] = "かけがわ";
		nameList[7] = "いとうのこうせい";
		
		for (int i = 0; i < 3; i++) {
			System.out.println("おれの友達の名前は" + nameList[1] + "だ。");
		}

	}

}
