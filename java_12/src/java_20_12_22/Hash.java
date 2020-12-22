package java_20_12_22;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		HashSet<Num> set = new HashSet<Num>(); //equals와 hashcode가 같아야함
		//equals와 hashcode를 호출하는 주체는 set
		
		set.add(new Num(7799));//equals는 맞지만 hashcode는 다름
		set.add(new Num(9955));
		// 오버라이딩하지 않으면 집합이 객체의 주소값으로 된다. 즉, 7799주소(100번지), 9955주소(200번지), 7799주소(300번지)
		set.add(new Num(7798));//
		
		System.out.println("인스턴스 수 : " + set.size()); //size는 3 
		
		for(Num n : set) {
			System.out.print(n.toString() + "\t"); 
		}
		System.out.println();
		

	}

}

class Num {
	private int num;

	public Num(int n) {
		num = n;
	}
	
	@Override
	public int hashCode() {//해쉬코드의 값을 같게하기위해 분류
		
		return num%2; //오버라이딩 하지않고 object의 hashcoed는 주소값을 리턴한다.
	}


	@Override
	public String toString() {

		return String.valueOf(num);
	}

	@Override
	public boolean equals(Object obj) {
		if (num == ((Num) obj).num) {
			return true;
		} else {

			return false;
		}
	}
}
