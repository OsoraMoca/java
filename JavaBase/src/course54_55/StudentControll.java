package course54_55;

public class StudentControll {
	public static void main(String[] args) {
		
		Student tonari = new Student(26, "やすだ たいと");
		
		Student me = new Student(2, "いとう そら");
		
		Student[] mymen = { tonari, me};
		
		System.out.println(mymen[1].getName());
		
		mymen[0].setName("うめざわ こうき");
		System.out.println(mymen[0].getName());

	}
}
