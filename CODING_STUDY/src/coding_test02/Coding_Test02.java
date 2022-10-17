package coding_test02;
// 5층 건물, 1층 약국, 2층 정형외과, 3층 피부과, 4층 치과,
// 5층 헬스 클럽, 건물의 층을 누르면, 그 층이 어떤 곳인지 알려주는
//                   button               comment
// 엘리베이터가 있음. switch-case문 활용, 5인 경우,
// "5층 헬스 클럽입니다." 라고 출력이 되게 하시기 바랍니다.
// 다음은 button과 comment 변수의 입력 조건입니다.
// int button = 5;
// String comment;

public class Coding_Test02{
	public static void main(String[] args) {
		int button = 5;
		String comment;
		
		switch (button) {
		case 1: comment = "1층 약국";
			break;
		case 2: comment = "2층 정형외과";
		break;
		case 3: comment = "3층 피부과";
		break;
		case 4: comment = "4층 치과";
		break;
		case 5: comment = "5층 헬스 클럽";
		break;
		default:
			comment = "존재하지 않는 층";
		}
		System.out.println(comment + "입니다.");
	}
}
