package java_20_12_22;



public class Location {
	
	
	private int longitude;
	private int latitude;
	
	public Location(int longitude, int latitude) {
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
