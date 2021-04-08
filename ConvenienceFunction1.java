package conven;
import java.util.Scanner;

public class ConvenienceFunction1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			double temp;
		
			int i=0,j=0,choiceNumber=0, work=0;
			int NAME = 0; //이름
			int subject_c = 1;
			int subject_java = 2;
			int subject_python = 3;
			int subject_sql = 4;
			int SUM = 5;
			int AVG = 6;
		
			int c; //C점수를 문자열에서 정수로 변환하기 위해 선언
			int java; //자바점수를 문자열에서 정수로 변환하기 위해 선언
			int python; //파이썬점수를 문자열에서 정수로 변환하기 위해 선언
			int sql; //sql점수를 문자열에서 정수로 변환하기 위해 선언
		
			int num = sc.nextInt();
	     
	     str = new String[num][];
	     
		//데이터를 수정하는 기능
        System.out.print("수정 할 이름 : ");
        String nameSearch = sc.nextLine();
        {
          if(nameSearch.equals(str[i][NAME]))
          {
           System.out.print("수정 할 데이터 중 1.C 2.Java 3.Python 4.Sql\n번호를 입력하세요 :");
           choiceNumber = sc.nextInt();
           sc.nextLine();
           
           if(choiceNumber == subject_c)
           {
            String modifyScore;
            System.out.print("현재 C 점수 :"+str[i][subject_c]+"\n");
            System.out.print("몇 점으로 수정 하시겠습니까 ? ");
            modifyScore = sc.next();
            c = Integer.parseInt(modifyScore);
            java = Integer.parseInt(str[i][subject_java]);
            python = Integer.parseInt(str[i][subject_python]);
            sql = Integer.parseInt(str[i][subject_sql]);
            
            str[i][subject_c] = Integer.toString(c);
            str[i][SUM] = Integer.toString(c+java+python+sql);
            
            temp = Double.parseDouble(str[i][SUM]);
            temp /= 3;
            str[i][AVG] = ""+temp;
            System.out.println("C 점수 수정 완료");
           }
           else if(choiceNumber == subject_java)
           {
            String modifyScore;
            System.out.print("현재 Java 점수 :"+str[i][subject_java]+"\n");
            System.out.print("몇 점으로 수정 하시겠습니까 ? ");
            modifyScore = sc.next();
            
            c = Integer.parseInt(str[i][subject_c]);
            java = Integer.parseInt(modifyScore);
            python = Integer.parseInt(str[i][subject_python]);
            sql = Integer.parseInt(str[i][subject_sql]);
            
            str[i][subject_java] = Integer.toString(java);
            str[i][SUM] = Integer.toString(c+java+python+sql);
            
            temp = Double.parseDouble(str[i][SUM]);
            temp /= 3;
            str[i][AVG] = ""+temp;
            System.out.println("Java 점수 수정 완료");
           }
           else if(choiceNumber == subject_python)
           {
            String modifyScore;
            System.out.print("현재 Python 점수 :"+str[i][subject_python]+"\n");
            System.out.print("몇 점으로 수정 하시겠습니까 ? ");
            modifyScore = sc.next();
            
            c = Integer.parseInt(str[i][subject_c]);
            java = Integer.parseInt(str[i][subject_java]);
            python = Integer.parseInt(modifyScore);
            sql = Integer.parseInt(str[i][subject_sql]);
            
            str[i][subject_python] = Integer.toString(python);
            str[i][SUM] = Integer.toString(c+java+python+sql);
            
            temp = Double.parseDouble(str[i][SUM]);
            temp /= 3;
            str[i][AVG] = ""+temp;
            System.out.println("Python 점수 수정 완료");
           }
          }
     }
        break;

	}

}
