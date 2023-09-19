package course36;

public class UseClass {

	public static void main(String[] args) {
		
		Student st = new Student();

		st.setName("わたべ");
		st.setCourse("高度情報処理科");
		st.setSchool("国際理工");

		st.display();

		Student st2 = new Student();
		st2.setName("ぬまた");
		st2.setCourse("情報システム科");
		st2.setSchool("船橋情報専門学校");

		st.display();
		st2.display();
		
		Kaden a = new Kaden();
		Kaden b = new Kaden();
		
		a.setName("冷蔵庫");
		b.setName("洗濯機");
		
		a.setPrice(10000);
		
		a.display();
		b.display();

	}

}
