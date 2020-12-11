package java_20_12_09;

public class StringArray {

	public static void main(String[] args) {

		String[] sr = new String[7];
		sr[0] = new String("Java");
		sr[1] = new String("System");
		sr[2] = new String("Compiler");
		sr[3] = new String("Park");
		sr[4] = new String("Tree");
		sr[5] = new String("Dinner");
		sr[6] = new String("Brunch Cafe");

		int cnum = 0;
		for (int i = 0; i < sr.length; i++) {
			cnum += sr[i].length(); //각번지수의 문자 길이를 cnum에 저장, 함수를 호출해야함
			//sr.length(데이터타입이 배열 객체의 길이) 와  sr[i].length()(문자열의 길이)와 구분
			System.out.println(cnum);
		}

		System.out.println("총 문자의 수 " + cnum);

	}

}
