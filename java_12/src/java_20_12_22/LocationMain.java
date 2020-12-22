package java_20_12_22;

import java.util.HashMap;
import java.util.Scanner;

public class LocationMain {

	public static void main(String[] args) {
		int count = 1;
		String country;
		int longitude, latitude;
		Scanner sc = new Scanner(System.in);
		HashMap<String, Location> lo = new HashMap<String, Location>();

		System.out.println("도시, 경도, 위도를 입력하세요.");
		while (true) {

			System.out.print(">>");
			country = sc.next();
			longitude = sc.nextInt();
			latitude = sc.nextInt();

			lo.put(country, new Location(longitude, latitude));
			count++;

			if (count > 4) {
				break;
			}

		}

		while (true) {

			System.out.print("도시 이름 >>");
			country = sc.next();

			if (country.equals("그만")) {

				return;
			}

			if (lo.containsKey(country)) {
				System.out.print(country);
				System.out.print(", " + lo.get(country).getLongitude() + ", " + lo.get(country).getLatitude());
			} else {
				System.out.println(country + "는 없습니다.");
			}
			System.out.println();

		}

	}

}
