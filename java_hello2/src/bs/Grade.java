package bs;

public class Grade {

	int kor, eng, math;
	double avg;

	public void print() {
		System.out.printf("평균 : %.2f점\n",getAvg());
	}

	public Grade(int kor, int eng, int math) {

		this.kor = kor;
		this.eng = eng;
		this.math = math;

	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public double getAvg() {
		return (kor + eng + math) / 3.0;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

}
