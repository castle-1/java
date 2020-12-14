package java_20_12_14;

public class Object {
	
	private int num;
	
	public Object(int num) {
		this.num = num;
	}
	
	public int run() {
		
		return num*num;
		
	}
	
	@Override
	public String toString() {
		
		return "넓이는 " + run()+ " 입니다.";
	}
	
	

}
