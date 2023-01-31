package 배열;

public class Ex09_foreach문 {

	public static void main(String[] args) {

		// for-each문
		// >> 뒤의 요소를 처음부터 끝까지 꺼내서 변수에 담아 출력
		// >> 인덱스가 필요없는 값 자체를 특정 조건에서 출력할 때 사용 가능
		
		// 1. 정수형 데이터 10개를 담을 수 있는 배열 arr 선언
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

}
