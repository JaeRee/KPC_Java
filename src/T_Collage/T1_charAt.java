package T_Collage;
import java.util.*;

public class T1_charAt {
	
	public static void main(String[] args) {
		
		char ch = 'a';
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Է�: ");
		ch =sc.next().charAt(0);						// ���� �ϳ��� �Է¹޴� �Լ�
		
		System.out.println(ch);
		
		
		// ã�°��� ������, ����, ���
		// switch(ã�°�) {�����;{
		// break���� ����/�ݺ��� {��}�� �������� (��, if�� ����)
		
		
		switch(ch) {
		case 'a': System.out.println("apple");
		case 'b': System.out.println("banaa"); break;
		case 'c': System.out.println("***"); break;
		case 'd': System.out.println("****"); break;
		case 'e': System.exit(0);						// Exit �ٷ� ���α׷� ����
		default: System.out.println("1~."); break;
		
		}	
	}

}



// ����������
// %d: 10�� ����
// %f: �Ǽ�
// %c: ���� 1��
// %s: ���ڿ�



// �ڹ� �⺻��(8��)
// boolean(1byte) - true/false �� ���� ����
// char(2byte) - ���� 1���� ���� ���� (�ٿ�ǥ ���)
// byte(1byte) - ����
// short(2byte) - ����
// int (4byte)
// long(8byte) - ���� (����Ʈ Ÿ��)
// float(4byte) - �Ǽ�
// double(8byte) - �Ǽ� (����Ʈ Ÿ��)

// ������(Ŭ���� ������ �Ǿ�����) - �ּҸ� ���� ������!