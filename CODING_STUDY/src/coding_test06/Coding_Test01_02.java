package coding_test06;

// 한 점을 나타내기 위해 자료형 매개 변수로
// x, y 두 멤버 변수를 선언하는 Point 클래스를 생성합니다.
// 한 점을 나타내는 Point 클래스의 두 좌표 x, y는
// 정수일 수도 있고 실수일 수도 있습니다.
// 그래서, T와 V라는 자료형 매개변수로 표현하며,
// 이 변수들을 위한 메서드 getX(), getY()는
// T와 V를 반환하고 있는 제네릭 메서드입니다.
// 두 점의 위치를 표현할 때 x좌표는 Integer를 사용하고,
// y 좌표는 Double을 사용합니다.
// 문제 : 두 점을 매개변수로 받아 만들어지는 사각형의 넓이를
// 계산하는 자바 프로그램을 작성해 봅니다.
// 이때, 두 점이 Integer형으로 만들어질 수도 있고,
// Double형으로 만들어질 수도 있기 때문에
// 넓이를 계산하는 makeRectangle() 메서드를 제네릭 메서드로 만들어 줍니다.
// 그리고, 다음의 실행 결과와 같이 출력되도록 프로그래밍 합니다.
// 실행 결과
// 두 점으로 만들어진 사각형의 넓이는 100.0입니다.

class Point<T, V>{
	T x;
	V y;
	
	public Point(T x, V y) {
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public V getY() {
		return y;
	}
	
}

public class Coding_Test01_02{
	
	public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2){
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		return width * height;
	}
	
	public static void main(String[] args) {
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double> p2 = new Point<Integer, Double>(10, 10.0);
		
		double rect = Coding_Test01_02.makeRectangle(p1, p2);
		System.out.println("두 점으로 만들어진 사각형의 넓이는 " + rect + "입니다.");
	}
}