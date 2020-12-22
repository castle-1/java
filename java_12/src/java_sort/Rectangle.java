package java_sort;

public class Rectangle implements Comparable{

	private int width;
	private int heiht;

	public Rectangle(int width, int height) {
		this.width = width;
		this.heiht = height;
	}

	public int getArea() {
		return width * heiht;
	}

	

	
	@Override
	public int compareTo(Object o) { //디폴트는 오름차순
		
		return this.getArea() - ((Rectangle)o).getArea();
		//디폴트로 봤을때
		//결과가 양수가 나온다면 자리바꿈이 일어난다.
		//결과가 음수가 나온다면 자리바꿈이 안 일어난다.
		//내림차순으로 바꾸려면 순서를 바꾸면 가능하다.
	
	}

}

class RecArrays {
	   
	   public static Rectangle[] sort(Object[] arrRecs) {
	      Rectangle[] recs = (Rectangle[])arrRecs;
	      Rectangle temp = null;
	      
	      if(recs instanceof Comparable[]) {// implements Comparable 을 상속 받은 recs
	    	  //Rectangle이  implements Comparable을 상속받지 않더라도 디폴트(오름차순) compareTo 사용가능 
	         
	         for(int i = 0 ; i < recs.length ; i++) {
	            for(int j = 0 ; j < recs.length -i -1 ; j ++) {
	               
	               if(recs[j].compareTo(recs[j+1]) > 0) {
	                       temp = recs[j];
	                       recs[j] = recs[j + 1];
	                       recs[j + 1] = temp;
	               }            
	            }
	         }
	         
	         
	      }else {// implements Comparable 을 상속 받지 않은 recs
	         
	         for(int i = 0 ; i < recs.length ; i++) {
	            for(int j = 0 ; j < recs.length -i -1 ; j ++) {
	               if(recs[j].getArea() > recs[j+1].getArea()) {
	                       temp = recs[j];
	                       recs[j] = recs[j + 1];
	                       recs[j + 1] = temp;
	               }
	            }
	         }
	         
	      }
	      
	      
	      return recs;
	   }
	}

