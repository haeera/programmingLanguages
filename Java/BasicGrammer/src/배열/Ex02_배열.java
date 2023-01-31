package 배열;

public class Ex02_배열 {

	public static void main(String[] args) {

		// 1. 1차원 정수형 배열 선언 후 임의의 값으로 초기화
		int[] array = {-10, -44, -55, -7, -81, -150};
		
		// 2. 배열의 값 중 가장 큰 값 출력
		int max = array[0];  // 최댓값을 저장하는변수 >> 0을 지정하면 음수값 비교할 수 없음
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("가장 큰 값은 >> " + max);
	}

}
