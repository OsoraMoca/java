package course56;

public class StudentControll {
	
	public static void main(String args[]) {
		
		Student stu1 = new Student();
		
		stu1.setName("そら");
		stu1.setSyussekibango(2);
		
		//ポッポケ
		PoPocke pocke = new PoPocke();
		
		pocke.setName("ピカチュウ");
		pocke.setZukanNo(25);
		pocke.setType("電気");
		pocke.setKotaichi(6);
		pocke.setNickname("ピカピカ");
		
		System.out.println("名前：" + pocke.getName());
		System.out.println("図鑑番号：" + pocke.getZukanNo());
		System.out.println("タイプ：" + pocke.getType());
		System.out.println("個体値：" + pocke.getKotaichi());
		System.out.println("ニックネーム：" + pocke.getNickname());
		
	}

}
