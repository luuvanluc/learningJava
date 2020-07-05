

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// There are 2 methods of initialize string
		String str1 = "Hello";
		String str2 = new String("World");
		System.out.println("str1 la " + str1);
		System.out.println("str2 la " + str2);
		// 1.Compare strings
		System.out.println("Chuoi str1 co bang 'hello' khong: eqauls = " + str1.equals("hello"));
		System.out.println("Chuoi str1 co bang 'hello' khong: equalsIgnoseCase = " + str1.equalsIgnoreCase("hello"));
		String version1 = "1.1.2";
		String version2 = "1.1.3";
		System.out.printf("Co 2 phien ban la version 1 la %s va version 2 la %s\n", version1, version2);
		int compare = version1.compareTo(version2);
		if (compare > 0) 
			System.out.println("version 1 moi hon version 2");
		else if (compare < 0)
			System.out.println("version 1 cu hon version 2");
		else
			System.out.println("version 2 bang voi version 2");
		
		//2. Concatenate string
		String str3 = str1 + " " + str2 + "!";
		System.out.println("Chuoi str1 noi voi chuoi str2 la " + str3);
		
		//3. Some other methods with strings
		String str4 = str3.substring(6, str3.length() - 1);
		System.out.printf("Chuoi bat dau tu phan tu thu %d den phan tu thu %d cua %s la %s\n", 6, str3.length() - 1, str3, str4);
		System.out.printf("In hoa va in thuong chuoi %s la %s va %s \n", str3, str3.toUpperCase(), str3.toLowerCase());;
		String str5 = str3.replace("Hello", "Hi");
		System.out.printf("Thay the Hello bang Hi trong %s. Ket qua la %s\n", str3, str5);
	}

}
