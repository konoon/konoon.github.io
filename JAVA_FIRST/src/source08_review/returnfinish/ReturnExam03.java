package source08_review.returnfinish;

public class ReturnExam03 {

	int memberVar;
	
	void test() {
		System.out.println("test() : 여기는 실행이 됩니다.");
		if(true) {
			return; // void 함수 내에서 return;은 함수를 마치는 역할을 함
		}
		System.out.println("여기는 실행이 안됩니다.");
	}
	
	int test2() {
		return 0; // return 0;을 하게 되면 0이란 값을 return값을 호출한 곳으로 반환해 줌
	}
	
	public static void main(String[] args) {
		ReturnExam03 t = new ReturnExam03();
		System.out.println("void 함수에서 return; 이란 함수를 종료시키는 의미 " + "아무것도 리턴하지 않음. 즉 함수를 마침");
		t.test();
		
		int tmp = t.test2();
		System.out.println(tmp);
		System.out.println("return문은 어떤 값이나 객체를 처리하고 return 후 대기할 경우에도 활용함 : tmp = " + tmp);
	}

}
