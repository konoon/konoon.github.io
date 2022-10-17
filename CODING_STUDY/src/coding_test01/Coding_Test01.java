package coding_test01;

// 참고 웹사이트 출처 : BAEKJOON ONLINE JUDGE
// 참고 웹사이트 https://www.acmicpc.net/problem/1001
// 문제 : 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
// 출력 : 첫째 줄에 A-B를 출력한다.
// 예제 입력(예시)
//    3
//    2
// 예제 출력(예시)
//    1

import java.util.Scanner;  // java.util 패키지에 있는 Scanner 클래스를 import 하여 활용함

public class Coding_Test01 {
   public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);  // System으로부터 in 입력 받은 값을 Scanner 클래스를 참조하는 참조변수 scan에 대입함
      System.out.print("첫번째 숫자를 입력해 주시기 바랍니다 ==> ");
      int a = scan.nextInt();  // 앞서 생성한 scan 변수에 입력된 값을 int(정수형) 변수 a에 대입함
      System.out.print("두번째 숫자를 입력해 주시기 바랍니다 ==> ");
      int b = scan.nextInt(); // 앞서 생성한 scan 변수에 입력된 값을 int(정수형) 변수 b에 대입함
      
      System.out.print(a-b); // 앞서 입력 받은 int(정수형) 변수 a의 값과 int(정수형) 변수 b의 값을 차이값을 화면으로 출력 확인함.
      
      scan.close();  // 스트림을 닫아줌 (참고 웹 사이트 https://sims-solve.tistory.com/2)
   }
}