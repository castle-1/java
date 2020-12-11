package java_20_12_07;

public class ClassMethod {

	public static void main(String[] args) {
		
		NumberPrinter.showInt(20); //클래스명을 통해서 접근가능
		//클래스 메소드를 통해 접근하는 것이 더 좋다. 다이렉트로 접근이 가능하기때문.
		
		NumberPrinter np = new NumberPrinter();
		np.showDouble(3.15);//객체를 통해서 접근이 가능
		np.setNumber(75);
		np.showMyNmber();

	}

}
