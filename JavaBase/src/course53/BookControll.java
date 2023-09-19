package course53;

public class BookControll {

	public static void main(String[] args) {

		Book book1 = new Book();

		//Book book2 = new Book("ITワールド");
		
		//練習問題②
		Book book3 = new Book("ITワールド", 3080);
		
		//練習問題③
		System.out.println(book3.getTitle());
		System.out.println(book3.getPrice() + "円");

	}
}
