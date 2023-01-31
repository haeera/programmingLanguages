package 이차원배열;

public class Ex03_이차원배열 {

	public static void main(String[] args) {

		// 5행 5열 크기의 2차원 배열 선언하고 21~45까지 초기화
		int[][] arr = new int[5][5];
		
		// 입력
		int cnt = 21;
		
		for(int j = 0; j < 5; j++) {
			for(int i = 0; i < 5; i++) {
				arr[j][i] = cnt++;
			}
		}
		
		// 출력 >> 45부터 세로로 진행
		for(int j = 0; j < 5; j++) {
			for(int i = 0; i < 5; i++) {
				System.out.printf("%4d", arr[4-i][4-j]);
			}
			System.out.println();
		}
		
	}

}
