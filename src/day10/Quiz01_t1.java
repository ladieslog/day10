package day10;

import java.util.Scanner;

public class Quiz01_t1 {
	public int high =0;
	Scanner pulls =new Scanner(System.in);
	public void Game() {
		int a,b,n=1;
		a=(int)(Math.random()*100)+1;
		while (true) {
			System.out.print("컴퓨터 숫자를 맞치시오");
			System.out.print(a);		
			b=pulls.nextInt();
			if(a==b) {
				high(n);
				break;
			}else if (a>b){
				System.out.println("=== U  P ===");
			}else if( a<b) {
				System.out.println("=== DOWN ===");
			}
			n++;
		}	
	}
	public void show() {
		if(high==0) {
			System.out.println("게임을 시작하세요 !!!");
		}else {
			System.out.println("최고기록은 "+high+"회 입니다!!! ");
		}	
	}
	public void high(int n) {
		System.out.println(n+"회 만에 맞췃습니다. ");
		if(high>n) {
			high=n;
			System.out.println("최고 기록을 갱신하셨습니다.");
		}else if(high==0) {
			high=n;
			System.out.println("최고 기록을 갱신하셨습니다.");
		}
	}
}
