package day10;

import java.util.Scanner;



public class Quiz01_t2 {
	public static void main(String[] args) {
		int a;
		Scanner pulls =new Scanner(System.in);
		Quiz01_t1 quiz =new Quiz01_t1();
		
		while(true) {
			System.out.print("== UP & Down Game ===\n"
					+ "1. 게임시작 \n2. 게임전적 \n3. 게임종료 \n>>>> ");
			a=pulls.nextInt();
			if(a==1) {
				quiz.Game();
			}else if(a==2) {
				quiz.show();
			}else if (a==3) {
				System.out.println("게임이 종료됩니다.");
				break;
			}else {
				System.out.println("존재 하지 않는 번호입니다.");
			}
		}
	}
}
