package 배열;

import java.util.Scanner;

public class Ex03_배열 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 1. 5개의 점수 입력 후 출력
		int[] score = new int[5];
		
		for(int i = 0; i < score.length; i++) {
			System.out.print((i+1)+"번째 입력 >> ");
			score[i] = sc.nextInt();
		}
		
		System.out.print("입력된 점수 >> ");
		for(int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		
		// 2. 입력한 점수 중 최고 점수와 최저 점수 출력
		// 3. 점수의 총합과 평균 출력
		int max = score[0];
		int min = score[0];
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			} else if(score[i] < min) {
				min = score[i];
			}
			sum += score[i];
		}
		System.out.println();
		System.out.println("최고 점수 >> " + max);
		System.out.println("최저 점수 >> " + min);
		System.out.println("총합 >> " + sum);
		System.out.println("평균 >> " + (double) sum/score.length);

	}

}
