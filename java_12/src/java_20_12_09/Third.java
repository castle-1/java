package java_20_12_09;

public class Third {
//양의 정수 10개를 랜덤생성하여, 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
	
	private int[] num = new int[10];
	
	private void input() {
		for(int i = 0;i<num.length;i++) {
			num[i] = (int)(Math.random()*10+1);
		}
		
	}
	
	private void thirdPrint() {
		System.out.print("num배열에 저장된 수 : ");
		for(int i = 0;i<num.length;i++) {
			
				System.out.print(num[i] + " ");
			
		}
		System.out.println();
		
		System.out.print("num에 저장된 3의 배수 : ");
		for(int i = 0;i<num.length;i++) {
			if(num[i] %3 ==0){
				System.out.print(num[i] + " ");
			}
		}
		System.out.println();
		
	}
	
	public void totalRun() {
		input();
		thirdPrint();
		
	}

}
