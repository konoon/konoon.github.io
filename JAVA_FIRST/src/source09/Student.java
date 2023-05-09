package source09;

// Implicit(암시적), Explicit(명시적)
// Implicit super constructor People() is undefined for default constructor. Must define an explicit constructor -> 명시적으로 생성자를 정의하라는 경고 문구
public class Student extends People {

	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // super는 부모 생성자를 호출
		this.studentNo = studentNo;
	}

}
