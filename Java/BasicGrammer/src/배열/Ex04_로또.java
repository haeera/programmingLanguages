package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex04_로또 {

	public static void main(String[] args) {
		
		Random rd = new Random();

		// 6칸짜리 lotto 배열에 1~45까지 숫자 랜덤으로뽑기
		int[] lotto = new int[6];
		
		System.out.println("===== 로또 타임 =====");
		System.out.println("이번주 출력번호는요...!!! 두구두구두구!!!!");
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = rd.nextInt(45)+1;
			
			// 중복 체크 >> 뽑힌 숫자가 이전에 한번이라도 뽑힌 적이 있다면 다시 뽑기
			for(int j = 0; j < i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		// 1차원 배열 출력하기 >> Arrays.toString
		System.out.println(Arrays.toString(lotto));
		
	}

}
