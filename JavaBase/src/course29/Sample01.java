package course29;

public class Sample01 {

	public static void main(String[] args) {

		
		//クラス「Human」から、インスタンス「human1」を生成
		Human human1 = new Human();

		//human1にパラメータを設定
		human1.name = "システム太郎";
		human1.hobby = "基数変換";
		human1.address = "サーティファイ本社";

		//クラス「Human」から、インスタンス「human2」を生成
		Human human2 = new Human();

		//human2にパラメータを設定
		human2.name = "システム花子";
		human2.hobby = "パック10進数";
		human2.address = "国際理工学園182号館";

		//メソッド呼び出し
		human1.talk();
		human2.talk();
		
		Human me = new Human();
		
		me.name = "伊東輝空";
		me.address = "成田市";
		me.hobby = "音ゲー";
		
		me.talk();
		
	}

}
