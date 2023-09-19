package course41;

public class Test3 {

	public static void main(String[] args) {

		//⑬
		String x = mojicon("今のところ全問正解でしょ？");
		System.out.println(x);

	}

	//⑬
	static String mojicon(String moji) {
		String concated = moji + "を受け取りました";
		return concated;
	}

}
