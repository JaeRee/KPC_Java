package T_Collage;
// �ֻ���(1~6) 2���� ������ ���ڸ� ���ߴ°���
// 5���� ��ȸ�� ��

// >>���ȭ��<<
// [1��° ����]
// �����Է�:10
// Ʋ�Ƚ��ϴ�.
// 5�� ��Ʋ���� ������ �˷���!

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
			
			System.out.println("["+i+"]��° �����Դϴ�.");
			
			System.out.print("������ �Է��ϼ���: ");
			result = sc.nextInt();
			if(result<2||result>13) {
				System.err.println("2~12������ ���ڸ� �Է����ּ���.");
				continue;
			}
			
			if(result==sum) {
				System.out.println("�����Դϴ�.");
				System.exit(0);
			}else {
				System.err.println("Ʋ�Ƚ��ϴ�.");
				if(sum>result)
				{
					System.out.println(result+"���� Ů�ϴ�.");
				}else {
					System.out.println(result+"���� �۽��ϴ�..");
				}
			}
		} 
		System.out.println("5ȸ�� ��ȸ�� ��� ����߽��ϴ�.");
		System.out.println("������"+sum+"�Դϴ�.");
	}
}
