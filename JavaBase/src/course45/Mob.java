package course45;

public class Mob {

	public static void main(String[] args) {
		
		//①
		int[] numExArr = { 10 , 50 , 30 , 20 , 40 };
		
		/*
		numExArr[4] = numExArr[0];
		
		System.out.println(numExArr[4]);
		*/
		
		//②
		int save = numExArr[0];
		numExArr[0] = numExArr[4];
		numExArr[4] = save;
		/*
		System.out.println(numExArr[0]);
		System.out.println(numExArr[4]);
		*/
		
		//③
		save = numExArr[1];
		numExArr[1] = numExArr[3];
		numExArr[3] = save;
		
		System.out.println(numExArr[0]);
		System.out.println(numExArr[4]);
		System.out.println(numExArr[1]);
		System.out.println(numExArr[3]);

	}

}
