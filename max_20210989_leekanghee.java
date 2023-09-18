import java.util.Random;
public class max_20210989_leekanghee {
	private static final int r_max = 100;

	public static void main(String[] args) {
		int[] array = new int[5];
		int max = 0;
		Random ran = new Random();
		
		
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(r_max)+1;
			System.out.print(array[i]+ " ");
		}
		
		for (int i = 0; i<array.length; i++) {
			if (max<array[i]) max = array[i];
		}
		
		System.out.println("");		
		System.out.println("max : " + max);
		


	}

}
