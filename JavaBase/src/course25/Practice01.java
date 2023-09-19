package course25;

public class Practice01 {

	public static void main(String[] args) {
		//①
		huku();

		//②
		hukuCalc();
		
		//③
		int a = 30;
		int b = 50;
		hukuTasu(a , b);
	}

	//①
	static void huku() {
		System.out.println("復習問題です");
	}

	//②
	static void hukuCalc() {
		System.out.println(1 + 1);
	}
	
	//③
	static void hukuTasu(int x , int y) {
		System.out.println(x + y);
	}	

}
