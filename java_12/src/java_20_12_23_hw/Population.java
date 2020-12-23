package java_20_12_23_hw;

import java.util.HashMap;
import java.util.Scanner;

public class Population {

	private HashMap<String, Integer> population;
	Scanner sc = new Scanner(System.in);

	public Population() {
		population = new HashMap<String, Integer>();
	}

	public void run() {
		input();
		search();

	}

	private void input() {

		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");

		while (true) {

			System.out.print("나라 이름, 인구 >>");
			String country = sc.next();

			if (country.equals("그만")) { //조심

				return;
			}

			int popu = sc.nextInt();
			population.put(country, popu);

		}

	}

	private void search() {
		System.out.println("검색을 시작합니다.");
		while (true) {
			String country;

			System.out.print("인구 검색 >>");
			country = sc.next();

			if (country.equals("그만")) {
				break;
			}
			if (population.containsKey(country)) {
				System.out.println(country + "의 인구는 " + population.get(country));
			} else {
				System.out.println(country + "라는 나라는 없습니다.");
			}

		}

	}

}
