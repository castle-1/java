package java_20_12_08;

public class CompString {

	public static void main(String[] args) {

		String st1 = "Lexicographicallay"; // st1 과 st2의 주소는 다름 대소문자를 구분함
		String st2 = "lexicographicallay";
		int cmp;

		if (st1.equals(st2)) { // 대소문자를 구분
			System.out.println("두 문자열은 같습니다.");
		} else {
			System.out.println("두 문자열은 다릅니다.");
		}

		
		cmp = st1.compareTo(st2); // st1 의 문자열과 st2의 문자열 비교 함수
		if (cmp == 0) {
			System.out.println("두 문자열은 일치합니다.");
		} else if (cmp < 0) {// st1이 사전상에서 st2보다 앞에 나온다. st1<st2
			System.out.println("사전의 앞에 위치하는 문자 : " + st1);
		} else {
			System.out.println("사전의 앞에 위치하는 문자 : " + st2);
		}

		
		if (st1.compareToIgnoreCase(st2) == 0) {
			System.out.println("두 문자열은 같습니다.");
		} else {
			System.out.println("두 문자열은 다릅니다.");
		}

	}

}
