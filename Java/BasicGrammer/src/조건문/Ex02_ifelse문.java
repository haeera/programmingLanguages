package 조건문;

import java.util.Scanner;

public class Ex02_ifelse문 {

	public static void main(String[] args) {
		
		// 마트 계산대 프로그램
		// 10000원짜리 추석선물 세트를 구입했을 때 지불해야 하는 금액 계산하기
		// 단, 11개 이상 구매 시에는 10% 할인
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사려는 상품의 개수를 입력하세요 >> ");
		
		int cnt = sc.nextInt();
		int money = 0;
		
		if(cnt <= 10) {
			money = cnt * 10000;
		} else {
			money = cnt * 9000;
		}
		System.out.println("가격은 " + money + "원 입니다.");
		
	}

}
