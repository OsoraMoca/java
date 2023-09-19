package course36;

public class Kaden {
	
	String name;
	static int price;
	
	void display() {
		System.out.println(name);
		System.out.println(price);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getPrice() {
		return price;
	}

	public static void setPrice(int price) {
		Kaden.price = price;
	}

}
