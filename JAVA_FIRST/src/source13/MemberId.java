package source13;

// hashCode() 메서드 재정의 추가

public class MemberId {
	public String id;
	
	public MemberId(String id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		// id사 동일한 문자열인 경우, 같은 해시코드를 리턴함
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MemberId) {
			MemberId member = (MemberId) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
}
