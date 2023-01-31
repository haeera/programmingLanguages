package 배열;

import java.util.Scanner;

public class Ex07_입력별출력 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 1. 정수를 5번 입력받아 별 개수 출력하기
		int[] starArray = new int[5];
		
		for(int i = 0; i < starArray.length; i++) {
			System.out.print(i+1 + "번째 별의 개수 입력 >> ");
			starArray[i] = sc.nextInt();
		}
		
		for(int j = 0; j < starArray.length; j++) {
			System.out.print(starArray[j] + " : ");
			for(int i = 0; i < starArray[j]; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
