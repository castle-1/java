package java_20_11_30;

public class Ex22 {

	public static void main(String[] args) {
		
		starPrint(5);

	}
	
	public static void starPrint(int num) {
			for(int i=1;i<=num;i++) {
			
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
