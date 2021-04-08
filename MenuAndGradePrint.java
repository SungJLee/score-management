import java.util.Scanner;

public class MenuAndGradePrint {

	public static void main(String[] args) {
		
		int subject_c = 0, subject_java = 0, subject_python = 0, subject_sql = 0, sum = 0, avg = 0;
		
		String letter;
		
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
					
					Scanner sc = new Scanner(System.in);

					System.out.print("C의 성적을 입력하세요 : ");
					subject_c = sc.nextInt();
			        System.out.print("Java 성적을 입력하세요 : ");
			        subject_java = sc.nextInt();
			        System.out.print("Python 성적을 입력하세요 : ");
			        subject_python = sc.nextInt();
			        System.out.print("SQL의 성적을 입력하세요 : ");
			        subject_sql = sc.nextInt();
			        
			        
					sum = subject_sql +  subject_java + subject_c + subject_python;
					
					avg = sum/4;
					
					System.out.println(sum);
					System.out.println(avg);
					break;
				case 2: // 성적 출력
					System.out.println("C : "+ subject_c + " " + "Java : " + subject_java + " " + "Python : " + subject_python + " " + "SQL : " + subject_sql);
					System.out.println("총점 :" + sum);
					System.out.println("평균 :" + avg);
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
					break;
			}
		}
		
	}

}
