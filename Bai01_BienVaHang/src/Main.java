
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bai 1 - Bien Trong Java");
		// Declare variables
		String name = "Luu Van Luc";
		int id = 238296;
		boolean man = true;
		float weight = 50.5f;
		// Declare constant variable
		final float PI = 3.14f;
		final char c = 'a';
		
		System.out.print("Ten: \t\t");
		System.out.println(name);
		System.out.print("Ma nhan vien: \t");
		System.out.println(id); 
		System.out.print("Gioi tinh: \t");
		if (man == true)
		{
			System.out.println("Nam");
		}
		else
		{
			System.out.println("Nu");
		}
		System.out.print("Can nang: \t");
		System.out.println(weight);
		
		System.out.printf("Hang so Pi l%c %f", c, PI);
	}

}
