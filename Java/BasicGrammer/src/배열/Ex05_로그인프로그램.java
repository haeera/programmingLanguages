package 배열;

import java.util.Scanner;

public class Ex05_로그인프로그램 {

	public static void main(String[] args) {

		// 회원가입/로그인 프로그램 만들기
		Scanner sc = new Scanner(System.in);
		
		// 1. id - pw 저장 공간 만들기 (3칸)
		String[] id = new String[3];
		String[] pw = new String[3];
		
		id[0] = "haeera";
		pw[0] = "1234";
		
		id[1] = "moon";
		pw[1] = "0810";
		
		// 2. 메뉴 선택하여 프로그램 동작하기
		while(true) {
			System.out.print("[1]회원가입 [2]로그인 [3]종료 >> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.println("==== 회원가입 ====");
				System.out.print("ID를 입력해주세요 >> ");
				id[2] = sc.next();
				System.out.print("PW를 입력해주세요 >> ");
				pw[2] = sc.next();
				System.out.println("회원가입 성공!!");
				
			} else if(menu == 2) {
				System.out.println("==== 로그인 ====");
				System.out.print("ID >> ");
				String input_id = sc.next();
				System.out.print("PW >> ");
				String input_pw = sc.next();

				boolean check = true;  // 로그인 성공 or 실패 체크
				
				for(int i = 0; i < id.length; i++) {
					if(id[i].equals(input_id) && pw[i].equals(input_pw)) {
						System.out.println("로그인 성공");
						check = false;
						break;
					}
				}
				
				if(check) {
					System.out.println("로그인 실패");
				}
				
			} else if(menu == 3) {
				System.out.println("==== 프로그램 종료 ====");
				break;
				
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}
		
	}

}
