package course13;

public class Practice04 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			
			if (i == 3) {
				System.out.println("3週目");
			} else if (i == 6) {
				System.out.println("あと4週");
			} else if (i == 10) {
				System.out.println("最後のループ");
			}
		}

	}

}
