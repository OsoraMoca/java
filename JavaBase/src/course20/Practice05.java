package course20;

public class Practice05 {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };
		
		int a = 0;
		int b = 0;
		
		for (int num : arr) {
            if (a == 0 || a == 4) {
            	b = b + arr[a];
            }
		}
		
		System.out.println(a);
		//????????????????????????????
	}

}
