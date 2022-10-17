package coding_test01;

import java.util.Scanner;

// 참고 웹사이트 출처 : BAEKJOON ONLINE JUDGE
// 참고 웹사이트 https://www.acmicpc.net/problem/2839
// 백준 코딩테스트 문제  2839 : 설탕 배달
// 상근이는 요즘 설탕공장에서 설탕을 배달하고 있다.
// 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 
// 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다.
// 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
// 상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다.
// 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 
// 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면,
// 더 적은 개수의 봉지를 배달할 수 있다.
// 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때,
// 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
/* 도출 방법
1) 5로 나누어 떨어지면 변수에 그 몫의 값을 대입해준다.
2) 5로 나누어 떨어지지 않으면, 설탕(n)에서 3을 빼고 1)번에서 설정한 변수에 1만큼씩 증가시킨다.
3) n이 0보다 작을 경우 -1을 반환한다.
4) 위 과정을 반복한다.

  목적은 '최소 봉지'의 값을 구하는 것이기 때문에 5로 먼저 나눈 후 안나눠질 때마다
  3으로 나눌 수 있는 지, 3만큼을 빼서 확인하는 방식으로 구현함.
*/

public class Coding_Test05{
	public static void main(String[] args) {
		System.out.println("설탕을 몇 kg 배달하실건가요?");
		
		// user에게 입력 받은 수를 저장 처리할 scanner 활용
		Scanner scanSugar = new Scanner(System.in);
		int n = scanSugar.nextInt();
		
		// 설탕 봉지의 수
		int sugarCnt = 0;
		
		// 봉지의 수가 나올 때까지 while문을 돌려줌
		while (true) {
			// n이 5로 나누어 떨어진다면
			if(n % 5 == 0) {
				// 아래 문장 출력 후
				System.out.println(n/5 + sugarCnt + "개가 최소 봉지의 수입니다.");
				// 위에 구문의 문장 출력 후에 조건문에서 빠져나옴
				break;
				// n이 음수라면
			} else if(n <= 0) {
				System.out.println(-1); // -1을 출력 처리함
				break; // 조건문에서 나옴
			}
			// 위의 조건을 만족하지 못했을 경우에는 n에서 3을 빼서 처리함
			n = (n -3);
			sugarCnt++; // 설탕 봉지의 수를 늘려줌
		}
		scanSugar.close();
	}
}
