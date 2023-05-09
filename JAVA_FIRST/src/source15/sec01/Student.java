package source15.sec01;

// 사용자 정의 객체인 Student를 키로 하고 점수를 값으로 저장하는 HashMap 활용 예시
// 학번과 이름이 동일한 Student를 동등 키로 간주하기 위해 Student 클래스에 hashcode()와 equals()메서드를 재정의

public class Student {
	public int sno; // 학번을 sno변수에 저장
	public String name; // 이름을 name 변수에 저장
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	// 학번 sno 와 이름 name 이 같다면 동일한 값을 리턴 처리함
	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}

	// 학번 sno 와 이름 name이 같다면 true를 리턴 처리함
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (sno == student.sno) && (name.equals(student.name));
		} else {
			return false;
		}
	}
	
}
