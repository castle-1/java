package java_20_11_27;

public class Ex16 {

	public static void main(String[] args) {
		int num = 0;
		int count = 0;

		while ((num++) < 100) {//100이랑 비교후 1증가
			
			if ((num % 5) != 0 || (num % 7) != 0) { //num은 1,5와7의 최소 공배수면 출력 그외에는 continue
				continue;

			}
			count++; //5와7의 최소공배수일때 하나씩 증가 ->100 안에 최소공배수가 몇개?
			System.out.println(num);
		}
		System.out.println("count : " + count);

	}

}
