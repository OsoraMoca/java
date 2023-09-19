package course40;

public class Practice_arrey {

	public static void main(String[] args) {
		
		//①
		int[] numbers = { 10 , 20 , 30 , 40 , 50 };
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		//②
		String[] cities = { "東京" , "大阪" , "千葉", "神奈川" , "埼玉笑" };
		
		for (int i = 0; i < cities.length; i++) {
			System.out.println(cities[i]);
		}
		
		//③
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println(sum);
		
		//④
		int a = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (a < numbers[i]) {
				a = numbers[i];
			}
		}
		System.out.println(a);
		
		//⑤
		int[] numbers2 = { 11 , 20 , 31 , 40 , 51 };
		
		for (int i = 0; i < numbers2.length; i++) {
			if (numbers2[i] % 2 == 1) {
				System.out.println(numbers2[i]);
			}
		}
	}

}
