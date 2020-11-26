package java_20_11_26;

public class Ex09_01 {

	public static void main(String[] args) {
		
		int num1 = 7;
		int result;
		
		result = (++num1)-5;
		System.out.println(result);
		
		result = (num1++) - 5;
		System.out.println(result);
		System.out.println(num1);
		
		int x = 10;
		int y = x-- + 5 + --x;
		//10 5 8 -> x-- + 5연산시 실행단위가 끝나기 때문에 x--실행 -> x=9
		//그다음 15(x-- + 5) + --x -> 15+8 ->23
		System.out.println(y);
		
	

	}

}
