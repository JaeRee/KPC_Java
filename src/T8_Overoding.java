// 오버로딩 개념

public class T8_Overoding {
	
	public static void main(String[] args) {
		
		System.out.print("");
		
	}
	
	// 오버로딩: 메소드명이 같으면서,
	// 1. 매개변수의 개수가 다르거나
	// 2. 매개변수의 타입이 다르면 됨!
	// 단, 반환타입이나 매개변수명이 다른 건 상관없다.
	
	
	void add() {}
	void add(double a) {}
	void add(int a) {}
	void add(int a, int b) {}
	
	
}
