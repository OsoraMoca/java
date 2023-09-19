package course22;

public class Practice03 {

	public static void main(String[] args) {
		
		String[][] ox = {{"o", "x", "o"}, {"x", "o", "x"}, {"o", "o", "o"}};
		
		int count = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("現在の要素は" + ox[i][j]);
				if (ox[i][j].equals("o")) {
					count = count + 1;
				}
			}
			System.out.println();
		}
		System.out.println("oの数は" + count);
	}

}
