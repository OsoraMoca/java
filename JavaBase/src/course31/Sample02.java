package course31;

public class Sample02 {

	public static void main(String[] args) {
		
		Books book1 = new Books("ITワールド", 100, "サーティファイ");
		
		Books book2 = new Books("明解Java", 400, "柴田望洋");
		
		Books[] arr = {book1, book2};
		
		//配列にしまったインスタンスを呼び出すときは以下のように書く。
		System.out.println(arr[1].name);

	}

}
