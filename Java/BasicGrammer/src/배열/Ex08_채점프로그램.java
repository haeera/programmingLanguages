package 배열;

import java.util.Scanner;

public class Ex08_채점프로그램 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] answer = {1, 4, 3, 2, 1};
		int[] user = new int[5];
		
		// 1. 답 5개 입력받기
		System.out.println("==== 채점하기 ====");
		System.out.println("답을 입력하세요");
		
		for(int i = 0; i < user.length; i++) {
			System.out.print(i+1 + "번 답 >> ");
			user[i] = sc.nextInt();
		}
		
		// 2. 채점 결과와 총점 출력(배점은 각 20점)
		System.out.print("정답 확인? ");
		int sum = 0;
		for(int i = 0; i < answer.length; i++) {
			if(answer[i]==user[i]) {
				System.out.print("O" + " ");
				sum += 20;
			} else {
				System.out.print("X" + " ");
			}
		}
		System.out.println();
		System.out.println("총점 : " + sum);
		
	}

}
