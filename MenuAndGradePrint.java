import java.util.Scanner;

public class MenuAndGradePrint {

	public static void main(String[] args) {
		
		int subject_c = 19, subject_java = 8, subject_python = 6, subject_sql = 5, sum = 4, average = 4;
		
		
		boolean swi = true;
		
		
		while(swi){
			System.out.println("1. 성적 입력 및 총점 평균 계산");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 정렬");
			System.out.println("4. 성적 정정");
			System.out.println("5. 나가기");
			
			Scanner scan = new Scanner(System.in); 
			System.out.print("> ");
			int choice = scan.nextInt();
			
			
			switch(choice){
				case 1: // 성적 입력 및 총점과 평균 계산
					break;
				case 2: // 성적 출력
					System.out.println("C : "+ subject_c + " " + "Java : " + subject_java + " " + "Python : " + subject_python + " " + "SQL : " + subject_sql);
					System.out.println("총점 :" + sum);
					System.out.println("평균 :" + average);
					break;
				case 3: // 성적 정렬
					break;
				case 4: // 성적 정정
					break;
				case 5 : // 나가기
					swi = false;
					break;
				default :
					System.out.println("잘못 입력하셨습니다.");
				
			}
		}
		
	}

}
