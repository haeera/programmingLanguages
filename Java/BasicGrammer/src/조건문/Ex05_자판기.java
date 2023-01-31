package 조건문;

import java.util.Scanner;

public class Ex05_자판기 {

	public static void main(String[] args) {

		// 금액을 입력하고 메뉴를 고른 뒤 잔돈 출력하기
		// 입력한 금액이 선택한 메뉴의 가격보다 부족하면 "금액이 부족합니다." 출력하기
		// 잔돈을  때, 천원, 오백원, 백원짜리를 몇개 줘야하는지 계산하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액을 투입해주세요 >> ");
		int money = sc.nextInt();
		
		System.out.println("1. 데자와(700원) 2. 실론티(1000원) 3. 솔의눈(500원)");
		System.out.print("메뉴를 골라주세요 >> ");
		int menu = sc.nextInt();
		
		int change = 0;  // 잔돈을 저장하는 변수
		
		if (menu == 1 && money >= 700) {
			change = money - 700;
		} else if (menu == 2 && money >= 1000) {
			change = money - 1000;
		} else if (menu == 3 && money >= 500) {
			change = money - 500;
		} else if (menu == 1 || menu == 2 || menu == 3) {
			System.out.println("금액이 부족합니다.");
			change = money;
		} else {
			System.out.println("잘못 입력하셨습니다.");
			change = money;
		}
		
		System.out.println("잔돈 : " + change + "원");
		System.out.println("천원 : " + (change/1000) + "개, " + "오백원 : " + (change%1000/500) + "개, " + "백원 : " + (change%500/100) + "");
		
		
	}

}
