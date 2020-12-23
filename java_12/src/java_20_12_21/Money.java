package java_20_12_21;

import java.util.Arrays;

public class Money {
	
	  public static void main(String[] args) {
	        
	      Rectangle[] recArr = {new Rectangle(6, 6),new Rectangle(5, 5),new Rectangle(10, 10),new Rectangle(12, 12),new Rectangle(11, 11)};
	      
	      //RecArrays.sort(recArr); //오버로딩
	      
	      Arrays.sort(recArr);// 오버라이딩
	      
	      
	     System.out.println( recArr.toString());
	      
	      for ( Rectangle rec: recArr) {
	         System.out.println(rec.getArea());
	      }
	      
	      
	      
	   }


}
