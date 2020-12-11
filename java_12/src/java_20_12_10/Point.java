package java_20_12_10;

public class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

}

class Point3D extends Point{//8번 문제
	private int z;
	
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public void moveUp() {
		this.z = z+1;
	}

	public void moveDown() {
		this.z = z-1;
	}
	
	/*public void move(int x, int y) {
		super.move(x, y);
	}*/

	public void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}
	
	public int getZ() {
		return z;
	}
	
	public String toString() {
		System.out.print("("+getX()+","+getY()+","+z+")의 점");
		return "";
		
	}
	
}





/*class ColorPoint extends Point{ //7번문제
	private String color;
	
	
	public ColorPoint(){
		super(0, 0);
		this.color ="BLACK";
		
	}
	
	public ColorPoint(int x, int y) {
		super(x, y);
	}

	public void setXY(int x, int y) {
		super.move(x, y);
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		System.out.print(color + "색의 " + "(" + getX() + "," + getY()+")의 점");
		return "";
		
	}
	
}*/

/*class ColorPoint extends Point{ //6번 문제
	private String color;
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public void setXY(int x, int y) {
		super.move(x, y);
	}

	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		System.out.print(color + "색의 " + "(" + getX() + "," + getY()+")의 점");
		return "";
		
	}
	
}*/
