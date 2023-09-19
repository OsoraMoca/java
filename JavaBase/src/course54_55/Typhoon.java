package course54_55;

public class Typhoon {
	private int typhoonbango;
	private String hasseibi;
	private String asiaName;

	//デフォルトコンストラクタ
	public Typhoon() {
		System.out.println("動いたった");
	}
	//引数有りコンストラクタ
	public Typhoon(int typhoonNum, String hasseiDate, String asiaName) {
		this.typhoonbango = typhoonNum;
		this.hasseibi = hasseiDate;
		this.asiaName = asiaName;
	}
	//getter,setter
	public int getTyphoonbango() {
		return typhoonbango;
	}
	public void setTyphoonbango(int typhoonbango) {
		this.typhoonbango = typhoonbango;
	}
	public String getHasseibi() {
		return hasseibi;
	}
	public void setHasseibi(String hasseibi) {
		this.hasseibi = hasseibi;
	}
	public String getAsiaName() {
		return asiaName;
	}
	public void setAsiaName(String asiaName) {
		this.asiaName = asiaName;
	}
}
