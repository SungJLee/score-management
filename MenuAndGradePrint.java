import java.util.Scanner;

public class MenuAndGradePrint {

	public static void main(String[] args) {
		
		int subject_c = 19, subject_java = 8, subject_python = 6, subject_sql = 5, sum = 4, average = 4;
		
		
		boolean swi = true;
		
		
		while(swi){
			System.out.println("1. ���� �Է� �� ���� ��� ���");
			System.out.println("2. ���� ���");
			System.out.println("3. ���� ����");
			System.out.println("4. ���� ����");
			System.out.println("5. ������");
			
			Scanner scan = new Scanner(System.in); 
			System.out.print("> ");
			int choice = scan.nextInt();
			
			
			switch(choice){
				case 1: // ���� �Է� �� ������ ��� ���
					break;
				case 2: // ���� ���
					System.out.println("C : "+ subject_c + " " + "Java : " + subject_java + " " + "Python : " + subject_python + " " + "SQL : " + subject_sql);
					System.out.println("���� :" + sum);
					System.out.println("��� :" + average);
					break;
				case 3: // ���� ����
					break;
				case 4: // ���� ����
					break;
				case 5 : // ������
					swi = false;
					break;
				default :
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				
			}
		}
		
	}

}
