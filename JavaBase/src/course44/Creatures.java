package course44;

//スーパークラス(親クラス)
public class Creatures extends Life{
	
	//変数
	private int weight;
	
	//メソッド
	void eat(String food, int cal) {
		System.out.println(food + "を食べた。体重が" + cal + "g増えた。");
		this.weight = this.weight + cal;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	

}
