// 배열 : 같은 타입의 연속된 공간을 사용하기 위해!

import java.util.Scanner;

public class T11 {
	public static void main(String[] args) {
		
		
		
		// 배열 : 같은 타입의 연속된 공간을 사용하기 위해!
		
		
		int num=0;
		Double sum = 0.0, aver = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성적을 입력할 인원은 몇명입니까?");
		System.out.print("인원: ");
		num = sc.nextInt();
		
		
		double[] stu = new double[num];
		
		for(int i=1 ; i<=num ; i++) {
			System.out.print("학생"+i+" 의 성적을 입력하세요: ");
			stu[i-1] = sc.nextDouble();
			sum += stu[i-1];
			aver = sum/num;
		}
		
		System.out.println();
		System.out.println(num+"명의 총점 : "+sum);
		System.out.println(num+"명의 평점 : "+aver);	
		
	}	

}
