package day10;

import java.util.Scanner;

public class Ex03_1 {
	public static int cnt=888;
	public static void func() {
		System.out.println("func");
	}
	
	
	//final
	public final String KOREA ="대한민국 ";
	public void funct() {
		System.out.println("변경전 korea : "+KOREA);
		Scanner input =new Scanner(System.in);
		System.out.print("입력 ");
		//KOREA =input.next();
		System.out.println("변경 후 KOREA : "+ KOREA);
	}
	
	
	
}
