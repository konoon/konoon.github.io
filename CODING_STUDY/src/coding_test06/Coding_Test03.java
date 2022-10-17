package coding_test06;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// HashMap에 String 타입의 아이디와
// Integer 타입의 점수가 저장합니다.
// 이때, 아래 실행 결과와 같이 평균 점수를 출력하고,
// 최고 점수와 최고 점수를 받은 아이디를 출력하는
// 자바 프로그램을 작성해 보시기 바랍니다.
// 실행 결과
// 평균점수: 91
// 최고점수: 96
// 최고점수를 받은 아이디: blue

public class Coding_Test03{
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		for (Map.Entry<String, Integer> entry : entrySet) {
			if(entry.getValue() > maxScore) {
				name = entry.getKey();
				maxScore = entry.getValue();
			}
			
			totalScore += entry.getValue();
		}
		
		int avgScore = totalScore / map.size();
		System.out.println("평균점수: " + avgScore);
		
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);
	}
}

