package day10;

import java.util.Scanner;

public class Ex04_1 {
	public static final String Status ="furmun ";
		
	public int age;
	public String name;
	
	public void enter() {
		Scanner input =new Scanner(System.in);
		System.out.println("�̸� �Է� ");
		name=input.next();
		System.out.println("���� �Է� ");
		age=input.nextInt();
		
	}
	public void display() {
		System.out.println("�̸� : "+name+"\n���� : "+age);
	}
	
}
