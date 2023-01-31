package OPP;

public class Student {
	
	private String name;  // 이름
	private String number;  // 학번
	private int age;  // 나이
	private int scoreJava;  // Java 점수
	private int scoreWeb;  // Web 점수
	private int scoreAndroid;  // Android 점수
	
	public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scoreAndroid) {
		super();
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}
	
	public void show() {
		System.out.println(name + "님 안녕하세요.");
		System.out.println("[ " + number + ", " + age + "살 ]");
		System.out.println(name + "님의 Java 점수는 " + scoreJava + "점 입니다.");
		System.out.println(name + "님의 Web 점수는 " + scoreWeb + "점 입니다.");
		System.out.println(name + "님의 Android 점수는 " + scoreAndroid + "점 입니다.");
		
	}
}
