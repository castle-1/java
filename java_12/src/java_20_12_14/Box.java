package java_20_12_14;

public class Box {

	public static void main(String[] args) {
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();

		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);

	}

	public static void wrapBox(Box box) { //파라미터
		if (box instanceof GoldPaperBox) { // box -> goldbox
			((GoldPaperBox) box).goldWrap(); // 형변환
		} else if (box instanceof PaperBox) { //box -> paperbox
			((PaperBox) box).paperWrap();
		} else {
			box.simpleWrap();
		}
	}

	public void simpleWrap() {
		System.out.println("simple Wrapping");

	}

}

class PaperBox extends Box {
	public void paperWrap() {
		System.out.println("Paper Wrapping");
	}
}

class GoldPaperBox extends Box {
	public void goldWrap() {
		System.out.println("Gold Wrapping");
	}
}
