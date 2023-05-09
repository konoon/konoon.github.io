package source10_interface.polymorphism;

public class OracleDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색 기능 메서드 활용");
	}

	@Override
	public void insert() {
		System.out.println("Oracle DB에서 삽입 기능 메서드 활용");
	}

	@Override
	public void update() {
		System.out.println("Oracle DB에서 수정 기능 메서드 활용");
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제 기능 메서드 활용");
	}

}
