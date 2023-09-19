package course40;

public class Practice_for {

	public static void main(String[] args) {
		
		//①
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		//②
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			
			if (i % 2 == 0) {
				System.out.println("現在" + i + "回目のループです。偶数です");
			}
		}
		
		//③
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		
		//④
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
