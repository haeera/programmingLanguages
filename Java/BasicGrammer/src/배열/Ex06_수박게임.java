package 배열;

import java.util.Scanner;

public class Ex06_수박게임 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 1. 1차원 문자형 배열 선언 후 '수', '박' 으로 초기화
		String[] arr = {"수", "박"};
		
		// 2. 숫자를 입력받아 짝수인 경우 "수박수박", 홀수인 경우 "수박수" 출력
		System.out.println("==== 수박 게임 Start! ====");
		System.out.print("숫자를 입력해주세요 >> ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if(i%2==1) {
				System.out.print(arr[0]);
			} else {
				System.out.print(arr[1]);
			}
		}
		
	}

}
