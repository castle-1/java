package java_20_12_15;

public class StringStack implements Stack {

	private int size;// 스택 크기
	private int top =-1;//텅빈스택은 -1로 초기화
	private String stack[]; // 문자열저장

	public StringStack(int size) {
		this.size = size;
		stack = new String[size];
		this.top = size;

	}

	public boolean stackNull() {
		if((stack == null)) {
			return true;
		}else {
			return false;
		}
	}

	

	@Override
	public int length() {

		return stack.length;// 만약 사이즈가 10, top이 7이라면 7개가 저장
	}

	@Override
	public int capacity() {

		return stack.length; //비어있는 스택
	}

	@Override
	public String pop() {//가장 최근에 입력된 문자열부터 출력
		int temp = top; 
		top++;
		return stack[temp];
	}

	@Override
	public boolean push(String val) { //문자열을 입력할때마다 top은 하나씩줄음
		if (top > 0) {
			stack[top - 1] = val;
			top--;
			return true;
		} else {

			return false;
		}
	}

}
