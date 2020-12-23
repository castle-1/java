package java_20_12_23_hw;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class StudentHashMapMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, StudentHashMap> stu = new HashMap<String, StudentHashMap>();
		
		while(true) {
			String studentName;
			System.out.println("이름을 입력하세요.");
			studentName = sc.next();
			if(studentName.equals("그만")) {
				break;
			}
			stu.put(studentName, new StudentHashMap());
			stu.get(studentName).input();
			
		}
		
		Set<String> ks = stu.keySet();
		for(String s : ks) {
			System.out.println("이름 : " + s);
			System.out.println(stu.get(s).toString());
		}
		

		while (true) {
			sc = new Scanner(System.in);
			boolean count = false;
			String student;
			
			System.out.print("학생 이름 >>");
			student = sc.next();
			
			if (student.equals("그만")) {
				sc.close();
				return;
			}
			if(stu.containsKey(student)) {
				System.out.print(student + " ");
				stu.get(student).search();
			}else {
				System.out.println(student + " 학생은 없습니다.");
			}

		}
		
		
	}
	
}
