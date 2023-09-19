package course11;

public class Practice5 {

	public static void main(String[] args) {
		
        int i = 0;
		
		while(i <= 100) {
			System.out.println("現在のカウントは" + i + "です");
			if(i > 0 && i % 10 == 0) {
				System.out.println("10の倍数");
			}
			i++;
		}
		

	  }

	}

