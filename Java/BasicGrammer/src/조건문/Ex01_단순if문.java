package 조건문;

import java.util.Scanner;

public class Ex01_단순if문 {

	public static void main(String[] args) {
		
		// 숫자를 입력받아
		// num이 3의 배수이면서 5의 배수라면 "3과 5의 배수입니다." 출력하기
		
		Scanner sc = new Scanner(System.in);  // 입력하는 도구

		System.out.print("숫자를 입력해주세요 >> ");
		int num = sc.nextInt();
		
		if(num%3==0 && num%5==0) {
			System.out.println("3과 5의 배수입니다.");
		}
	}

}
