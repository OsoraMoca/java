package course20;

public class Practice04 {

	public static void main(String[] args) {
		
		int[] arr = { 10, 20, 30, 40, 50 };
		
		for (int num : arr) {
			num = 333 - num;
			System.out.println(num);
		}

	}

}
