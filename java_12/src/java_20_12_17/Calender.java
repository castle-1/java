package java_20_12_17;

import java.util.Calendar;

public class Calender {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); //싱글톤, 객체를 딱 하나만 생성 가능하게해준다.
		
		
		int year = cal.get(Calendar.YEAR); //올해 년도
		int month = cal.get(Calendar.MONTH); //이번달
		int day = cal.get(Calendar.DATE); //오늘날짜
		int dow = cal.get(Calendar.DAY_OF_WEEK); //오늘이 무슨요일? 일요일이 1번
		int week = cal.get(Calendar.WEEK_OF_MONTH); //이번달 중 몇번째 주?
		int doy = cal.get(Calendar.DAY_OF_YEAR);//오늘이 365일중 몇일인지
		int woy = cal.get(Calendar.WEEK_OF_YEAR);//이번주가 올해에서 몇번째 주인가
		int dowi = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);//오늘 요일이 이달에서 몇번째 인가
		String[] dayOfTheWeek = new String[] {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		
		System.out.println("오늘은 " + year+"년도 " + month+"월 " + day+"일 " +dayOfTheWeek[dow-1] + "입니다.");
		System.out.println("이 달의 " + dowi+"번째 " + dayOfTheWeek[dow-1] + "입니다.");
		System.out.println("이 달의 "+week+"번째주 입니다.");
		System.out.println("이 해의 " + doy +"일 입니다.");
		System.out.println("이 해의 " + woy +"번째 주입니다.");
		
	}

}
