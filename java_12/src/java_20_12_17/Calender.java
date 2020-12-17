package java_20_12_17;

import java.util.Calendar;

public class Calender {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		int dow = cal.get(Calendar.DAY_OF_WEEK);
		int week = cal.get(Calendar.WEEK_OF_MONTH); //몇번째 주?
		int doy = cal.get(Calendar.DAY_OF_YEAR);
		int woy = cal.get(Calendar.WEEK_OF_YEAR);
		int dowi = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		String[] dayOfTheWeek = new String[] {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		
		System.out.println("오늘은 " + year+"년도 " + month+"월 " + day+"일 " +dayOfTheWeek[dow-1] + "입니다.");
		System.out.println("이 달의 " + dowi+"번째 " + dayOfTheWeek[dow-1] + "입니다.");
		System.out.println("이 달의 "+week+"번째주 입니다.");
		System.out.println("이 해의 " + doy +"일 입니다.");
		System.out.println("이 해의 " + woy +"번째 주입니다.");
		
		
		
		
		

	}

}
