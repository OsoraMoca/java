package course30;

public class UseClass {

	public static void main(String[] args) {

		Drink gogo = new Drink(100, "初期データ");

		gogo.price = 150;
		gogo.name = "午後の紅茶";

		gogo.display();

		int sum = gogo.calcSum(gogo.price, 250000);
		System.out.println("合計は" + sum);

	}

}
