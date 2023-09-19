package course35;

public class Sample01 {

	public static void main(String[] args) {
		
		//2つのcalcメソッドを呼び出し
		calc();
		
		calc(50 , 100);
		
		calc("あああ");
		
		calc(50);

	}
	
	static void calc() {
		System.out.println("計算をしたいときは、引数を2つのメソッドを呼び出してね");
	}
	
	static void calc(int a , int b) {
		System.out.println("計算結果は" + (a + b));
	}
	
	static void calc(String a) {
		System.out.println("渡された文字は" + a + "です");
	}
	
	static void calc(int a) {
		System.out.println("受け取った値は" + a + "です");
	}

}
