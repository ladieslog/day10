package day10;

import java.util.Scanner;

public class Quiz01_t1 {
	public int high =0;
	Scanner pulls =new Scanner(System.in);
	public void Game() {
		int a,b,n=1;
		a=(int)(Math.random()*100)+1;
		while (true) {
			System.out.print("��ǻ�� ���ڸ� ��ġ�ÿ�");
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
			System.out.println("������ �����ϼ��� !!!");
		}else {
			System.out.println("�ְ����� "+high+"ȸ �Դϴ�!!! ");
		}	
	}
	public void high(int n) {
		System.out.println(n+"ȸ ���� �­����ϴ�. ");
		if(high>n) {
			high=n;
			System.out.println("�ְ� ����� �����ϼ̽��ϴ�.");
		}else if(high==0) {
			high=n;
			System.out.println("�ְ� ����� �����ϼ̽��ϴ�.");
		}
	}
}
