package OPP;

public class PiggyBank {

	// 접근제한자 (Access Modifiers)
	// public >> 어디에서나 접근 가능
	// protected >> 상속 혹은 같은 패키지에서 접근 가능
	// private >> 같은 클래스 내애서만 접근 가능
	// (default) >> 아무것도 설정하지 않은 것 -> 같은 패키지에서 접근 가능
	private int money;  // 금액
	
	// 생성자 메소드
	// 1. 메소드의 이름은 클래스의 이름과 동일
	// 2. 리턴 타입을 지정할 수 없음
	// 3. new 키워드를 통해 생성될 때 호출됨
	// 4. 반드시 하나 이상 선언되어야 함
	// 단, 생성하지 않았다면 compile 시 기본 생성자가 만들어짐
	public PiggyBank(int money) {
		this.money = money;
	}
	
	// 입금
	public void deposit(int money) {
		this.money += money;
	}
	
	// 출금
	public void withdraw(int money) {
		this.money -= money;
	}
	
	// 잔액 확인
	public void showMoney() {
		System.out.println("현재 잔고 : " + money + "원");
	}
}
