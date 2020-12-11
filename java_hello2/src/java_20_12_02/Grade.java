package java_20_12_02;

public class Grade {

	int math, science, eng;

	public double average() {
		return (math + science + eng) / 3.0;

	}

	public Grade(int math, int science, int eng) {

		this.math = math;
		this.science = science;
		this.eng = eng;
	}
	public Grade() {
		
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

}
