package java_20_12_09;

public class PartiallyFilledArray {

	public static void main(String[] args) {
		
		int[][] arr = {
				{11},
				{22,33},
				{44,55,66}
		};
		
		for(int i = 0;i<arr.length;i++) { // arr.length 는 행 따라서 3번반복
			for(int j = 0;j<arr[i].length;j++) {//arr[i].length는 열을 의미 3번 반복
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
