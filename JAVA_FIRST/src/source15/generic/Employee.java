import java.io.*;


//수퍼클래스 Info
class Info {
	String $name;		// 이름
	int em_id;			// 입사지원번호
	static int id;  // em_id를 카운트시키기 위한 값

	// 수퍼클래스 Info의 생성자
	// 객체를 생성하면서 em_id 에 1을 더함.
	Info(){
		em_id = ++id;
	}
}//class


//서브클래스(1) Toeic
class Toeic Info {  
	
	String $rc;	// R/C 입력
	String $lc;	// L/C 입력
	int rc;			// R/C 성적
	int lc;			// L/C 성적
	int sum; 		//총점 990 만점
}//class



//서브클래스(2) Tople
class Tople extends Info {
	String	$grade;			//총점 300점 만점
	int		grade;		//토플성적
}

//메인 클래스
public class  Employee
{
	//메인 메소드
	public static void main(String[] args) 
	{
		
		try{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				Toeic[] te = new Toeic[3];
				Tople[] tp = new Tople[3];


				//자식객체 선언부분
				for(int i = 0 ; i < te.length ; i++) {
					te[i] = new Toeic();
				}//for

				for(int i = 0 ; i < tp.length ; i++) {
					tp[i] = new Tople();
				}//for

//입력부
				System.out.println("=======================================================");
				System.out.println("==  토익과 토플 우수성적으로 신입사원을 모집합니다.  ==");
				System.out.println("==  선착순으로 지원한 6명의 자료를 입력하세요.       ==");
				System.out.println("==  순서는 토익3명  -> 토플3명 입니다.               =="); 
				System.out.println("=======================================================");
				System.out.println();
				System.out.println();
				System.out.println("=======================================================");
				System.out.println("==        먼저 토익사원 3명을 입력하세요.            ==");
				System.out.println("=======================================================");
				for(int i = 0 ; i < te.length ; i++) {
					
					System.out.println("== 입사 지원번호 " + te[i].em_id + "번 ==");
					System.out.print("이    름 :");
					te[i].$name = br.readLine();
					System.out.print("토익 R/C :");
					te[i].rc = Integer.parseInt(te[i].$rc = br.readLine());
					System.out.print("토익 L/C :");
					te[i].lc = Integer.parseInt(te[i].$lc = br.readLine());
					System.out.println();
					te[i].sum = te[i].rc + te[i].lc;  // 토익점수 합계 계산
				}//for
				
				System.out.println();
				System.out.println("=======================================================");
				System.out.println("==        다음은 토플사원 3명을 입력하세요.          ==");
				System.out.println("=======================================================");
				System.out.println();
				
				for(int i = 0 ; i < tp.length ; i++) {
					System.out.println("== 입사 지원번호 " + tp[i].em_id + "번 ==");
					System.out.print("이    름 :");
					tp[i].$name = br.readLine();
					System.out.print("토플점수 :");
					tp[i].grade = Integer.parseInt(tp[i].$grade = br.readLine());
					System.out.println();
				}//for

//출력부
				
				System.out.println("=======================================================");
				System.out.println("=======================================================");
				System.out.println("입력이 끝났습니다. 감사합니다.");
				System.out.println("=======================================================");
				System.out.println("사원으로 선발된 00명의 사원을 발표합니다.");
				System.out.println("=======================================================");

				for (int i=0; ; i++)     
				{
					//점수가 800이상 990이하인 사람과 990이 넘는사람 검색
					if(te[i].sum >= 800 && te[i].sum <= 990)
					{
						
						System.out.println("입사지원번호 "+ te[i].em_id + "번 " + te[i].$name + " 님이 토익 " + te[i].sum + "점으로 합격하셨습니다.");
						System.out.println("");
						}//if
						//점수가 990이 넘은 사람
						else if (te[i].sum > 990) System.out.println("입사지원번호 "+ te[i].em_id + "번 " + te[i].$name + " 님의  토익성적은 잘못되었습니다.");

				}//for

				for (int i=0 ; i < tp.length ; i++)
				{
					//점수가 250이상 300이하인 사람과 300이 넘는사람 검색
					if(tp[i].grade >= 250 && tp[i].grade <= 300)
					{
						System.out.println("입사지원번호 "+ tp[i].em_id + "번 " + tp[i].$name + " 님이 토플 " + tp[i].grade + "점으로 합격하셨습니다.");
						System.out.println("");
						}//if
						else if(tp[i].grade >300) System.out.println("입사지원번호 "+ tp[i].em_id + "번 " + tp[i].$name + " 님의  토플성적은 잘못되었습니다.");
				}//for
				System.out.println("=======================================================");


		}//try
		catch(Exception e){
			System.err.println("에러입니다.");
		}//catch

	}//main
}//class
