package course33peir;

public class Practice02 {

	public static void main(String[] args) {
		
		//⑤
		offOff();
		
		//⑥
		String moji = prapra("練習問題");
		System.out.println(moji);
		

	}
	
	//⑤
	static void offOff() {
		System.out.println("呼び出されました");
	}
	
	//⑥
	static String prapra(String x) {
		String sum = x + "を受け取りました";
		return sum;
	}
	
	

}
