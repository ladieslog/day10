package day10;

import java.util.Scanner;

public class Ex01_2 {
	public static void main(String[] args) {
		
		Ex01 ex=new Ex01();
		System.out.println(ex.sumFunc(10, 40));
		System.out.println(ex.sumFunc(10, 40,20));
		System.out.println(ex.sumFunc(20, 12.5));
		System.out.println(ex.sumFunc("test", "golden"));
		
		Scanner input =new Scanner(System.in);
		
		
		int cnt=0;
		if(cnt==0) {
			int test =1000;
			System.out.println(cnt);
			System.out.println(test);
		}
		//System.out.println(test);
		
		
		ex.variable01();
		ex.variable02();
		
		System.out.println();
		//선언변수
		ex.func01();
		ex.func02();
		
		
		ex.cnt2 =888;
		
		
		
	}
}












