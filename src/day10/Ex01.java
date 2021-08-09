package day10;

public class Ex01 {
	public int sumFunc(int n1,int n2) {
		return n1+n2;
	}
	
	public int sumFunc(int n1,int n2, int n3) {
		return n1+n2+n3;
	}
	
	public double sumFunc(int n1,double n2) {
		return n1+ n2;
	}
	public String sumFunc(String n1,String n2) {return n1+n2;}
	
	
	//지역변수 예제
	public void variable01() {
		int var =12345;
		System.out.println("01 var : "+var);
	}
	public void variable02() {
		int var =12345;
		System.out.println("02 var : "+var);
	}
	
	public int cnt=10;
	public void func01() {
		cnt++; System.out.println("01 cnt : "+cnt);
	}
	public void func02() {
		cnt++; System.out.println("02 cnt : "+cnt);
	}
	
	
	public int cnt2 =777;
	
}





















