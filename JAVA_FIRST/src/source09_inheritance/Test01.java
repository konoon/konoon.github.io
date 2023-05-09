package source09_inheritance;

class Person {
	private String name; // 필드 생성
	private String sid;
	
	public void setInfo(String name, String sid) {
		this.name = name;
		this.sid = sid;
		System.out.println("이름은 " + name + " 주민등록번호는 " + sid + "***");
	}
	
	public void showInfo() {
		System.out.println("이름 = " + name);
		System.out.println("주민등록번호 = " + sid);
	}
}

class Student extends Person {
	private String hakbun;
	private int score;
	
	public Student() {
		System.out.println("Student 디폴트 생성자");
	}

	public Student(String hakbun, int score) {
		this.hakbun = hakbun;
		this.score = score;
	}

	@Override
	public void setInfo(String name, String sid) {
		super.setInfo(name, sid);
		System.out.println("학번은 " + hakbun + "이며, 학점은"  + score);
	}
	
	// setInfo라는 메서드 추가
	public void setStuInfo(String name, String sid, String hakbun, int score) {
		setInfo(name, sid);
		this.hakbun = hakbun;
		this.score = score;
		System.out.println("이름은 " + name + " 주민등록번호는 " + sid + "학번은" + hakbun + "학점은" + score);
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("학번 = " + hakbun);
		System.out.println("학점 = " + score);
	}
	
}

public class Test01 {
	public static void main(String[] args) {
//		Student stu = new Student();
//		stu.setStuInfo("장나라", "158215", "666", 80);
		Student stu1 = new Student("12121", 90);
		stu1.setInfo("김희선", "12212101012");
		
		Singer sing1 = new Singer();
		sing1.setInfo("전지현", "22010-4545");
		
		Singer sing2 = new Singer("노래", "소속사");
		sing2.setInfo("이영애", "021218-4465");
//		sing2.showInfo();
		
		Actor act1 = new Actor();
		act1.setInfo("김보성", "1275");
		
		Actor act2 = new Actor("의리");
		// 이름은 김보성 주민등록번호는 1275*** 가 출력되는 이유는 setInfo의 값(**줄)을 출력받고 있어서 나옴
		act2.setInfo("김보성", "1275");
	}
}
