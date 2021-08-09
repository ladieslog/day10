package day10;

import java.util.Scanner;

public class Ex04_1 {
	public static final String Status ="furmun ";
		
	public int age;
	public String name;
	
	public void enter() {
		Scanner input =new Scanner(System.in);
		System.out.println("이름 입력 ");
		name=input.next();
		System.out.println("나이 입력 ");
		age=input.nextInt();
		
	}
	public void display() {
		System.out.println("이름 : "+name+"\n나이 : "+age);
	}
	
}
