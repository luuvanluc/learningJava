
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Mang;
		Mang = new int [5];
		for(int i = 0; i < 5; i++)
			Mang[i] = i*3;
		for (int i = 0; i < 5; i++)
			System.out.printf("Phan tu thu %d cua Mang co gia tri la %d\n", i, Mang[i]);

		char[] Chuoi = {'L','U','C','\n'};
		System.out.print(Chuoi);
		int sum = 0;
		for(int i:Mang)
		{
			sum += i;
		}
		double avg = (double)sum/Mang.length;
		System.out.println("Tong cua Mang la " + sum);
		System.out.println("Trung binh cong trong Mang la " + avg);
		
	}

}
