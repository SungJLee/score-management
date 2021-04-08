import java.util.Scanner;

public class sumavg {

	public static void main(String[] args) {
		int subject_sql, subject_java, subject_c, subject_python;
		Scanner sc = new Scanner(System.in);

		System.out.print("1 번째 성적을 입력하세요 : ");
		subject_c = sc.nextInt();
        System.out.print("2 번째 성적을 입력하세요 : ");
        subject_java = sc.nextInt();
        System.out.print("3 번째 성적을 입력하세요 : ");
        subject_python = sc.nextInt();
        System.out.print("4 번째 성적을 입력하세요 : ");
        subject_sql = sc.nextInt();
        sc.close();
        
        int sum;
		sum = subject_sql +  subject_java + subject_c + subject_python;
		int avg;
		avg = sum/4;
		
		System.out.println(sum);
		System.out.println(avg);

	}

}