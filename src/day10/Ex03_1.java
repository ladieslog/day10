package day10;

import java.util.Scanner;

public class Ex03_1 {
	public static int cnt=888;
	public static void func() {
		System.out.println("func");
	}
	
	
	//final
	public final String KOREA ="���ѹα� ";
	public void funct() {
		System.out.println("������ korea : "+KOREA);
		Scanner input =new Scanner(System.in);
		System.out.print("�Է� ");
		//KOREA =input.next();
		System.out.println("���� �� KOREA : "+ KOREA);
	}
	
	
	
}
