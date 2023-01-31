package OPP;

public class StudentMain {

	public static void main(String[] args) {

		// 1. student1, student2 객체 생성하고 초기화
		Student student1 = new Student("나예호", "20200801", 20, 10, 80, 95);
		Student student2 = new Student("김운비", "20111003", 19, 90, 65, 30);
		
		// 2. 초기화한 학생 정보를 화면에 출력하는 show() 메소드 Student 클래스에 작성하고 main() 메소드에서 호출하여 정보 출력
		student1.show();
		System.out.println("========================================");
		student2.show();
	}

}
