package java_20_12_21;

class Rectangle implements Comparable{
    private int width;
    private int heigth;
    
    public Rectangle(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
    }
    
    public int getArea() {       
       return width * heigth;
    }
    
    @Override
    public String toString() {
    //	return "오름차순";
    	return "내림차순";
    }
   
    @Override
   public int compareTo(Object o) {      
      //return this.getArea() - ((Rectangle)o).getArea();
      return ((Rectangle)o).getArea() - this.getArea()  ;
   }   
}




class RecArrays {
	   
	   public static Rectangle[] sort(Object[] arrRecs) {
	      Rectangle[] recs = (Rectangle[])arrRecs;
	      Rectangle temp = null;
	      
	      if(recs instanceof Comparable[]) {
	         
	         for(int i = 0 ; i < recs.length ; i++) { //가장 큰수를 가장 앞으로
	            for(int j = 0 ; j < recs.length -i -1 ; j ++) {
	               
	               if(recs[j].compareTo(recs[j+1]) > 0) {//j보다 j+1의 넓이가더 크다
	                       temp = recs[j];
	                       recs[j] = recs[j + 1];
	                       recs[j + 1] = temp;
	               }            
	            }
	         }
	         
	         
	      }else {
	         
	         for(int i = 0 ; i < recs.length ; i++) {
	            for(int j = 0 ; j < recs.length -i -1 ; j ++) {
	               if(recs[j].getArea() > recs[j+1].getArea()) { //요소의 넓이를 비교
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
