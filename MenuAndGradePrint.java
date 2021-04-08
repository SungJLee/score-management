package conven;

import java.util.Scanner;

public class MenuAndGradePrint {

	public static void main(String[] args) {
		
		String [][] str; //2차원 배열의 할당
		
		double temp; //임의 저장공간
		int subject_c = 0, subject_java = 0, subject_python = 0, subject_sql = 0, sum = 0, average = 0, choiceNumber=0;
		int i=0,j=0, work=0;
		int NAME = 0;
		
		int c; //C점수를 문자열에서 정수로 변환하기 위해 선언
		int java; //자바점수를 문자열에서 정수로 변환하기 위해 선언
		int python; //파이썬점수를 문자열에서 정수로 변환하기 위해 선언
		int sql; //sql점수를 문자열에서 정수로 변환하기 위해 선언
		
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
			str = new String[choice][];
			
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
				case 4: 
					//데이터를 수정하는 기능
			        System.out.print("수정 할 이름 : ");
			        String nameSearch = scan.nextLine();
			        {
			          if(nameSearch.equals(str[i][NAME]))
			          {
			           System.out.print("수정 할 데이터 중 1.C 2.Java 3.Python 4.Sql\n번호를 입력하세요 :");
			           choiceNumber = scan.nextInt();
			           scan.nextLine();
			           
			           if(choiceNumber == subject_c)
			           {
			            String modifyScore;
			            System.out.print("현재 C 점수 :"+str[i][subject_c]+"\n");
			            System.out.print("몇 점으로 수정 하시겠습니까 ? ");
			            modifyScore = scan.next();
			            c = Integer.parseInt(modifyScore);
			            java = Integer.parseInt(str[i][subject_java]);
			            python = Integer.parseInt(str[i][subject_python]);
			            sql = Integer.parseInt(str[i][subject_sql]);
			            
			            str[i][subject_c] = Integer.toString(c);
			            str[i][sum] = Integer.toString(c+java+python+sql);
			            
			            temp = Double.parseDouble(str[i][sum]);
			            temp /= 3;
			            str[i][average] = ""+temp;
			            System.out.println("C 점수 수정 완료");
			           }
			           else if(choiceNumber == subject_java)
			           {
			            String modifyScore;
			            System.out.print("현재 Java 점수 :"+str[i][subject_java]+"\n");
			            System.out.print("몇 점으로 수정 하시겠습니까 ? ");
			            modifyScore = scan.next();
			            
			            c = Integer.parseInt(str[i][subject_c]);
			            java = Integer.parseInt(modifyScore);
			            python = Integer.parseInt(str[i][subject_python]);
			            sql = Integer.parseInt(str[i][subject_sql]);
			            
			            str[i][subject_java] = Integer.toString(java);
			            str[i][sum] = Integer.toString(c+java+python+sql);
			            
			            temp = Double.parseDouble(str[i][sum]);
			            temp /= 3;
			            str[i][average] = ""+temp;
			            System.out.println("Java 점수 수정 완료");
			           }
			           else if(choiceNumber == subject_python)
			           {
			            String modifyScore;
			            System.out.print("현재 Python 점수 :"+str[i][subject_python]+"\n");
			            System.out.print("몇 점으로 수정 하시겠습니까 ? ");
			            modifyScore = scan.next();
			            
			            c = Integer.parseInt(str[i][subject_c]);
			            java = Integer.parseInt(str[i][subject_java]);
			            python = Integer.parseInt(modifyScore);
			            sql = Integer.parseInt(str[i][subject_sql]);
			            
			            str[i][subject_python] = Integer.toString(python);
			            str[i][sum] = Integer.toString(c+java+python+sql);
			            
			            temp = Double.parseDouble(str[i][sum]);
			            temp /= 3;
			            str[i][average] = ""+temp;
			            System.out.println("Python 점수 수정 완료");
			           }
			          }
			     }
			
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
