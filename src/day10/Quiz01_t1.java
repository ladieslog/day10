package day10;

import java.util.Scanner;

public class Quiz01_t1 {
	public int high =0;
	Scanner pulls =new Scanner(System.in);
	public void Game() {
		int a,b,n=1;
		a=(int)(Math.random()*100)+1;
		while (true) {
			System.out.print("ƒƒ«ª≈Õ º˝¿⁄∏¶ ∏¬ƒ°Ω√ø¿");
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
			System.out.println("∞‘¿”¿ª Ω√¿€«œººø‰ !!!");
		}else {
			System.out.println("√÷∞Ì±‚∑œ¿∫ "+high+"»∏ ¿‘¥œ¥Ÿ!!! ");
		}	
	}
	public void high(int n) {
		System.out.println(n+"»∏ ∏∏ø° ∏¬≠üΩ¿¥œ¥Ÿ. ");
		if(high>n) {
			high=n;
			System.out.println("√÷∞Ì ±‚∑œ¿ª ∞ªΩ≈«œºÃΩ¿¥œ¥Ÿ.");
		}else if(high==0) {
			high=n;
			System.out.println("√÷∞Ì ±‚∑œ¿ª ∞ªΩ≈«œºÃΩ¿¥œ¥Ÿ.");
		}
	}
}
