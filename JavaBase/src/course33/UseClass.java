package course33;

public class UseClass {

	public static void main(String[] args) {
		
		Kaden reizo = new Kaden();
		
		reizo.setName ("マウス");
		
		System.out.println(reizo.getName());
		
		Kaden a = new Kaden();
		
		a.setCategory ("大型");
		
		System.out.println(a.getCategory());

	}

}
