package OPP;

public class PiggyBankMain {

	public static void main(String[] args) {

		// 1. PiggyBank 클래스를 통해 저금통 pb1을 생성하고 > 2000원을 기본 금액으로 설정
		PiggyBank pb1 = new PiggyBank(2000);
		
		// 2. showMoney() 호출해서 잔액 확인
		pb1.showMoney();
		
		// 3. 3000원 입금 (deposit)
		pb1.deposit(3000);
		pb1.showMoney();

		
		// 4. 1000원 출금 (withdraw)
		pb1.withdraw(1000);
		pb1.showMoney();

		
		// 5. showMoney() 호출해서 잔액 확인
		pb1.withdraw(0);
		
	}

}
