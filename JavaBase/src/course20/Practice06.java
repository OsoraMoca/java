package course20;

public class Practice06 {

	public static void main(String[] args) {
		
		String[] arr = { "x", "y", "x", "y", "x" };
		
		int num = 0;
		
		String moji = "x";
		
		for (String moji2 : arr) {
			if (arr.equals(moji)) {
				num = num + 1;
			}
		}
		System.out.println(num);
		
	}

}