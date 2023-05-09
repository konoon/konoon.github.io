package source10_interface.polymorphism;

public class SqlServerDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("SqlServerDao 검색 기능 메서드 활용");
	}

	@Override
	public void insert() {
		System.out.println("SqlServerDao 삽입 기능 메서드 활용");
	}

	@Override
	public void update() {
		System.out.println("SqlServerDao 수정 기능 메서드 활용");
	}

	@Override
	public void delete() {
		System.out.println("SqlServerDao 삭제 기능 메서드 활용");
	}

}
