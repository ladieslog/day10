package day10;

import java.util.Scanner;



public class Quiz01_t2 {
	public static void main(String[] args) {
		int a;
		Scanner pulls =new Scanner(System.in);
		Quiz01_t1 quiz =new Quiz01_t1();
		
		while(true) {
			System.out.print("== UP & Down Game ===\n"
					+ "1. ���ӽ��� \n2. �������� \n3. �������� \n>>>> ");
			a=pulls.nextInt();
			if(a==1) {
				quiz.Game();
			}else if(a==2) {
				quiz.show();
			}else if (a==3) {
				System.out.println("������ ����˴ϴ�.");
				break;
			}else {
				System.out.println("���� ���� �ʴ� ��ȣ�Դϴ�.");
			}
		}
	}
}
