package day10;

	import java.util.Scanner; 
	
	public class Quiz02_t2 { 
		public static void main(String[] args) { 
			Quiz02_t1 lot =new Quiz02_t1();
			/*
			int i, userNum;
			System.out.print("로또번호 추출 개수 : "); 
			Scanner sc = new Scanner(System.in); 
			userNum = sc.nextInt(); 
			for ( i = 1; i <= userNum; i++) { 
				System.out.println(i + "번째 :" 
			+ lot.lottoNumbers()); }
			sc.close(); */
			
			System.out.println(lot.lottoNumbers());
			} 
		

}
