// �迭 : ���� Ÿ���� ���ӵ� ������ ����ϱ� ����!

import java.util.Scanner;

public class T11 {
	public static void main(String[] args) {
		
		
		
		// �迭 : ���� Ÿ���� ���ӵ� ������ ����ϱ� ����!
		
		
		int num=0;
		Double sum = 0.0, aver = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��� �ο��� ����Դϱ�?");
		System.out.print("�ο�: ");
		num = sc.nextInt();
		
		
		double[] stu = new double[num];
		
		for(int i=1 ; i<=num ; i++) {
			System.out.print("�л�"+i+" �� ������ �Է��ϼ���: ");
			stu[i-1] = sc.nextDouble();
			sum += stu[i-1];
			aver = sum/num;
		}
		
		System.out.println();
		System.out.println(num+"���� ���� : "+sum);
		System.out.println(num+"���� ���� : "+aver);	
		
	}	

}
