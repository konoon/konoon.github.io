package source13;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		// obj 매개값이 Member 타입인지 확인함
		if(obj instanceof Member) {
			// 상위 obj 타입을 member 타입으로 강제 타입 변환하고 id 필드값이 동일한지 검사한 후에, id필드값이 동일하면 트루 리턴 
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		// 매개값이 member 타입이 아니거나, id 필드값이 다를 경우 false리턴
		return false;
	}
	
	
}
