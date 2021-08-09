package day10;
//Random
public class Ex02 {
	public static void main(String[] args) {
		int i,ran;
		for (i=0;i<5;i++) {
			System.out.println(Math.random()*3);
			ran = (int)(Math.random()*3)+10;
			System.out.println(ran);
		}
	}
}
