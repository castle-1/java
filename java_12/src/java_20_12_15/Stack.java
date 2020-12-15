package java_20_12_15;

public interface Stack {
	
	int length(); //현재 스택 에 저장된 개수
	int capacity(); // 스택에 저장가능한 수
	String pop();// top에 저장된 문자열 리턴
	boolean push(String val);//스택에 문자열 저장

}
