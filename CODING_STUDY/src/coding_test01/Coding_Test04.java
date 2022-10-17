package coding_test01;

import java.util.Scanner;

// 참고 웹사이트 출처 : BAEKJOON ONLINE JUDGE
// 참고 웹사이트 https://www.acmicpc.net/problem/1152
// 문제 : 영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어진다.
// 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
// 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
// 입력 : 첫 줄에 영어 대소문자와 띄어쓰기로 이루어진 문자열이 주어진다.
// 이 문자열의 길이는 1,000,000을 넘지 않는다.
// 단어는 띄어쓰기 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다.
// 또한 문자열의 앞과 뒤에는 공백이 있을 수도 있다
// 출력 : 첫째 줄에 단어의 개수를 출력한다.
// 예제 입력1(예시)
// Have a nice day
// 예제 출력1(예시)
// 4
// 예제 입력2(예시)
// Cheer Up
// 예제 출력2(예시)
// 2

public class Coding_Test04 {
   public Coding_Test04() {
      // System으로부터 in 입력 받는 값을
      // Scanner 클래스를 참조하는 참조변수 scan에 대입 처리함.
      Scanner scan = new Scanner(System.in);
      System.out.println("단어로 구분되는 문자열을 입력해 주시기 바랍니다.");
      
      // scan변수에 입력된 문자열을 String형 변수 str에 대입 처리함.
      // nextLine()은 공백까지 포함해서 읽어오기 때문에
      // trim() 이용해서 문자열을 앞, 뒤의 공백을 제거합니다.
      String str = scan.nextLine().trim();
      
      // 문자열이 없는 경우와 있는 경우에 따른 if문 활용함
      // isEmpty()는 문자열이 비어있는지를 확인해 줍니다.
      // 문자열이 비어 있으면 true를 출력하여 수행문을 실행시켜 줍니다.
      if (str.isEmpty()) {
         // 문자열을 입력하지 않았을 경우에는
         // 단어의 수는 0개이기에 0을 출력합니다.
         System.out.println("0");
         // 문자열이 비어있지 않는 경우
      } else {
         // split()으로 문자열을 나누어 줍니다.
         // 이때, 기준을(" ") 공백으로 잡아 나누어 주고,
         // length로 나눈 문자열의 개수를 출력해 줍니다.
         // 공백을 기준으로 문자열을 나누어줬기에 배열의 크기가 단어의 개수가 됩니다.
         System.out.println(str.split(" ").length);
      }
      scan.close(); // 스트림을 닫아 줍니다.
   }
}