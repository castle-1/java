package java_20_12_08;

public class Sb {

	public static void main(String[] args) {

		StringBuilder stbuf = new StringBuilder("123");
		stbuf.append(45678);
		System.out.println(stbuf.toString());// toString
		//print 에는 stubf가 들어갈 수없다 print에는 함수 오버로딩이 없다.
		//따라서 stubf를 string로 바꿔서 print에 대입
		//다형성이 적용되면 stubf를 print에 대입할 수 있다.

		stbuf.delete(0, 2);
		System.out.println(stbuf.toString());

		stbuf.replace(0, 3, "AB"); // 0~3번지 를 ab로
		System.out.println(stbuf.toString());

		stbuf.reverse(); //뒤집어서 출력
		System.out.println(stbuf.toString());

		String sub = stbuf.substring(2, 4); //2번지 이상 4번지 미만인 인덱스 
		System.out.println(sub);

	}

}
