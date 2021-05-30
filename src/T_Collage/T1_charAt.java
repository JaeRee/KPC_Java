package T_Collage;
import java.util.*;

public class T1_charAt {
	
	public static void main(String[] args) {
		
		char ch = 'a';
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력: ");
		ch =sc.next().charAt(0);						// 문자 하나만 입력받는 함수
		
		System.out.println(ch);
		
		
		// 찾는값은 변수명, 수식, 상수
		// switch(찾는값) {문장들;{
		// break문은 조건/반복문 {블럭}을 빠져나감 (단, if문 제외)
		
		
		switch(ch) {
		case 'a': System.out.println("apple");
		case 'b': System.out.println("banaa"); break;
		case 'c': System.out.println("***"); break;
		case 'd': System.out.println("****"); break;
		case 'e': System.exit(0);						// Exit 바로 프로그램 종료
		default: System.out.println("1~."); break;
		
		}	
	}

}



// 형식지정자
// %d: 10진 정수
// %f: 실수
// %c: 문자 1개
// %s: 문자열



// 자바 기본형(8개)
// boolean(1byte) - true/false 만 저장 가능
// char(2byte) - 문자 1개만 저장 가능 (다옴표 사용)
// byte(1byte) - 정수
// short(2byte) - 정수
// int (4byte)
// long(8byte) - 정수 (디폴트 타입)
// float(4byte) - 실수
// double(8byte) - 실수 (디폴트 타입)

// 참조형(클래스 명으로 되어있음) - 주소만 저장 가능함!