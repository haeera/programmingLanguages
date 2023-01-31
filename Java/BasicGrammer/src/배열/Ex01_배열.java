package 배열;

public class Ex01_배열 {

	public static void main(String[] args) {

		// 1. 1차원 정수형 배열 선언 후 임의의 값으로 초기화
		int[] array = {33, 25, 123, 10, 8, 4, 99, 341, 436, 34, 14};
		
		// 2. 배열의 값 중 홀수인 값이 몇 개인지 출력
		System.out.print("array에 들어있는 홀수 >> ");
		
		for(int i = 0; i < array.length; i++) {
			if(array[i]%2==1) {
				System.out.print(array[i] + " ");
			}
		}
		
	}

}
