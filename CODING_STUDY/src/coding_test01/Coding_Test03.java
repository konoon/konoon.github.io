package coding_test01;

// 참고 웹사이트 출처 : BAEKJOON ONLINE JUDGE
// 참고 웹사이트 https://www.acmicpc.net/problem/9498
// 문제 : 시험 점수를 입력받아 90 ~ 100점은 A,
// 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D,
// 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
// 도출 방법 :
// 점수 구간 별로 조건을 지정해 각 점수에 맞는 알파벳을 출력한다.

import java.util.InputMismatchException;
import java.util.Scanner;
 
public class Coding_Test03{
   public static void main(String[] args) {
      System.out.println("시험 점수를 입력해 주시기 바랍니다 ==> ");
      
      Scanner scanScore = new Scanner(System.in);
      
      // 정수 이외의 숫자가 입력될 경우에는 예외 처리함.
      try {
         int score = scanScore.nextInt();
         // 100점이 초과되는 점수를 입력할 경우에는
         if(score > 100) {
            System.out.println("100점 이하로 점수를 입력해 주시기 바랍니다!");
         } else if (score >= 90) {  // A구간
            System.out.println("A");            
         } else if (score >= 80) {  // B구간
            System.out.println("B");
         } else if (score >= 70) {  // C구간
            System.out.println("C");
         } else if (score >= 60) {  // D구간
            System.out.println("D");
         } else if (score > 0) {  // F구간
            System.out.println("F");
         } else {  // 음수를 입력할 경우
            System.out.println("점수를 잘못 입력하셨습니다!");
         }
      } catch (InputMismatchException e) {
         System.out.println("정수로 입력을 부탁드립니다!");
      }
      scanScore.close(); // scanner를 닫아 줌.
   }
}