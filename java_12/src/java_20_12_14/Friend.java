package java_20_12_14;

public class Friend {

	public static void main(String[] args) {
		
		UnivFriend friend = new UnivFriend("kim", "computer", "010-1111-2222");
		friend.showInfo();

	}

	protected String name;
	protected String phone;

	public Friend(String na, String ph) {
		this.name = na;
		this.phone = ph;

	}

	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + phone);
	}

}

class CompFriend extends Friend{
	
	
	private String department;
	
	public CompFriend(String na, String de, String ph) {
		super(na, ph);
		department = de;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("부서 : "+ department);
	}
	
	
}

class UnivFriend extends Friend{
	
	private String major;
	public UnivFriend(String na, String ma, String ph) {
		super(na, ph);
		major = ma;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("전공 : " + major);
	}
	
}
