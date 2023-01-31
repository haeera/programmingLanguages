package 조건문;

import java.util.Scanner;

public class Ex03_다중if문 {

	public static void main(String[] args) {

		// 점수를 입력받아
		// totalScore가 90점 이상이면 "A학점입니다."
		// 80점 이상 90점 미만일 경우 "B학점입니다."
		// 70점 이상 80점 미만일 경우 "C학점입니다."
		// 70점 미만일 경우 "D학점입니다."
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 >> ");
		int totalScore = sc.nextInt();
		
		if (totalScore >= 90) {
			System.out.println("A학점입니다.");
		} else if(totalScore >=80) {
			System.out.println("B학점입니다.");
		} else if(totalScore >= 70) {
			System.out.println("C학점입니다.");
		} else {
			System.out.println("D학점입니다.");
		}
		
	}

}
