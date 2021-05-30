package T_Collage;
// 주사위(1~6) 2개를 던져서 숫자를 맞추는게임
// 5번의 기회를 줌

// >>결과화면<<
// [1번째 도전]
// 정수입력:10
// 틀렸습니다.
// 5번 다틀리면 정답을 알려줘!

import java.util.*;
import java.math.*;

public class T3_HighLow {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = (int)(Math.random()*6+1);
		int num2 = (int)(Math.random()*6+1);
		
		int sum = num1 + num2;
		int result =0;
		
		
		for(int i=1; i<=5;i++){
			
			System.out.println("["+i+"]번째 도전입니다.");
			
			System.out.print("정수를 입력하세요: ");
			result = sc.nextInt();
			if(result<2||result>13) {
				System.err.println("2~12사이의 숫자만 입력해주세요.");
				continue;
			}
			
			if(result==sum) {
				System.out.println("정답입니다.");
				System.exit(0);
			}else {
				System.err.println("틀렸습니다.");
				if(sum>result)
				{
					System.out.println(result+"보다 큽니다.");
				}else {
					System.out.println(result+"보다 작습니다..");
				}
			}
		} 
		System.out.println("5회의 기회를 모두 사용했습니다.");
		System.out.println("정답은"+sum+"입니다.");
	}
}
