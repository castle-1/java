package java_20_12_23_hw;



public class Location {
	
	
	private int longitude;//위도
	private int latitude;//경도
	
	public Location(int longitude, int latitude) { //생성자
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	public int getLongitude() {
		return longitude;
	}
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
	public int getLatitude() {
		return latitude;
	}
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	
	@Override
	public String toString() {
		
		return longitude + "," + latitude;
	}
	
	

}
