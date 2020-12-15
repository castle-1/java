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

	@Override
	public int length() {

		return top;// 만약 사이즈가 10, top이 7이라면 7개가 저장
	}

	@Override
	public int capacity() {

		return size - top; //비어있는 스택
	}

	@Override
	public String pop() {
		int temp = top; // top = -1
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
