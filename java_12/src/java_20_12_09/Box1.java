package java_20_12_09;

public class Box1 {
	private int boxnum;
	private String str;

	Box1(int boxnum, String str) {
		this.boxnum = boxnum;
		this.str = str;
	}

	public int getBoxnum() {
		return boxnum;
	}

	public void setBoxnum(int boxnum) {
		this.boxnum = boxnum;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String toString() {
		return str;
	}

}
