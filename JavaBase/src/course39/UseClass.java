package course39;

public class UseClass {

	public static void main(String[] args) {

		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();

		st1.name = "そら";
		st1.no = 2;

		st2.name = "つっちー";
		st2.no = 18;

		st3.name = "さ";
		st3.no = 5;

		Student[] myfriend = { st1, st2, st3 };

		for (int i = 0; i < myfriend.length; i++) {
			System.out.println(myfriend[i].name);
		}

	}

}