package rec;

public class Rectagle {

	int height;
	int width;

	public int getHeight() { //세팅한 값을 가져오기
		return height;
	}

	public void setHight(int height) { //값을 세팅하기
		this.height = height;

	}

	public int getWidth() {
		return width;

	}

	public void setWidth(int width) {
		this.width = width;
	}
	public int  getArea() {
		return width*height;
		
	}

}
