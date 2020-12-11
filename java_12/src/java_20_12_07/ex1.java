package java_20_12_07;

public class ex1 {

	public static void main(String[] args) {
		
		String str1 = new String("Simple String");
		String str2 = "The Best String";
		
		System.out.println(str1);
		System.out.println(str1.length()); //공백을 포함한 문자열의 길이
		System.out.println();
		
		System.out.println(str2);
		System.out.println(str2.length());
		System.out.println();
		
		showStrint("Funny String");
		

	}

	public static void showStrint(String str) {
		System.out.println(str);
		System.out.println(str.length());
	}

}
