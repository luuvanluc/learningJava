
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] Mang2Chieu;
		Mang2Chieu = new int[4][5];
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 5; j++)
				Mang2Chieu[i][j] = i + j + i*j;
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 5; j++)
				System.out.printf("Mang2Chieu[%d][%d] = %d\n", i, j, Mang2Chieu[i][j]);
		
		/*The same with array 3d*/

	}

}
