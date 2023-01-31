package 조건문;

import java.util.Scanner;

public class Ex04_다중if문 {

	public static void main(String[] args) {

		// 정보처리기사의 각 과목의 정답 개수 5개 입력받아
		// 한 과목이라도 8개 미만인 경우, "불합격입니다!" 출력
		// 총 개수가 60개 이상이면 "합격입니다!" 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("소프트웨어 설계 : ");
		int softwarePlan = sc.nextInt();
		System.out.print("소프트웨어 개발 : ");
		int softwareDev = sc.nextInt();
		System.out.print("데이터베이스 구축 : ");
		int Database = sc.nextInt();
		System.out.print("프로그래밍 언어 활용 : ");
		int Programming = sc.nextInt();
		System.out.print("정보시스템 구축 관리 : ");
		int InfoSystem = sc.nextInt();
		
		if (softwarePlan < 8 || softwareDev < 8 || Database < 8 || Programming < 8 || InfoSystem < 8) {
			System.out.println("불합격입니다.");
		} else if (softwarePlan + softwareDev + Database + Programming + InfoSystem >= 60) {
			System.out.println("합격입니다.");
		}
		
	}

}
