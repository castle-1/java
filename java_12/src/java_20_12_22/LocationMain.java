package java_20_12_22;

import java.util.HashMap;
import java.util.Scanner;

public class LocationMain {

	public static void main(String[] args) {
		int count = 1; // while 몇번 반복할지 카운트
		String country;// 도시이름 을 받을 변수
		int longitude, latitude; //위도와 경도를 받을 변수
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Location> lo = new HashMap<String, Location>();
		//HashMap 의 파라미터로 string와 Location클래스 로 객체 생성
		
		System.out.println("도시, 경도, 위도를 입력하세요.");
		while (true) {

			System.out.print(">>");
			country = sc.next();
			longitude = sc.nextInt();
			latitude = sc.nextInt();

			lo.put(country, new Location(longitude, latitude));
			//HashMap에 도시이름과 Location 클래스의 '생성자'를 통해 위도와 경도를 전달
			count++;

			if (count > 4) {// count가 4가되면 break 즉, 4번 반복
				break;
			}

		}

		while (true) {

			System.out.print("도시 이름 >>");
			country = sc.next();

			if (country.equals("그만")) {
				sc.close();
				return;
			}

			if (lo.containsKey(country)) {
				// HashMap에 입력한 country 가 있다면 true 없다면 false 반환
				//즉, lo.put(country, new Location(longitude, latitude));
				//put 했을때 입력한 도시가 없다면 false 있다면 true
				
				System.out.print(country);
				System.out.print(", " + lo.get(country).getLongitude() + ", " + lo.get(country).getLatitude());
				//HashMap의 value를 호출할때 getter/setter을 통해 위도와 경도를 출력
				//lo.get(파라미터) -> value를 호출하는 방법
			} else {
				System.out.println(country + "는 없습니다.");
			}
			System.out.println();

		}

	}

}
