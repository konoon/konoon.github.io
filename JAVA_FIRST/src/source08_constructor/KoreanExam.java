package source08_constructor;

public class KoreanExam {

	public static void main(String[] args) {
		Korean k1 = new Korean("박지성", "010-1111-222");
		System.out.println("k1.name : " + k1.name);
		
		Korean k2 = new Korean("손흥민", "200302-1313131");
		System.out.println("k2.nation : " + k2.nation);
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
		
		Korean k3 = new Korean("장나라", "9000011-2302333");
		k3.nation = "캐나다";
		System.out.println("k3.nation : " + k3.nation);
		System.out.println("k3.name : " + k3.name);
		System.out.println("k3.ssn : " + k3.ssn);
	}

}
