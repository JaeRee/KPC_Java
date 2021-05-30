package T_Collage;
// 3명의 국영수 점수 총점 구하는 프로그램
// 번호 국어 영어 수학 총점


public class T6_ArrP1 {
	
	public static void main(String[] args) {
		
		
		int[][] arr = {{90,98,78},{77,80,90},{60,90,100}};
		int sum=0, num=1;
		double aver = 0.0;
		
		System.out.println("< 3명의 국영수 점수의 총점 구하는 프로그램>\n");
		System.out.println("번호\t국어\t수학\t영어\t총점\t평균");
		
		
		for(int i=0; i<arr.length ; i++) {
			
			System.out.printf("%2d\t",num+i);
			
			
			for(int j=0; j<arr[i].length ; j++) {
				
				sum += arr[i][j];
				aver = (double)sum/3;
				
				System.out.printf("%3d\t",arr[i][j]);
			
				// 국어점수 따로 수학
				}
				System.out.print(sum+"\t");
				sum=0;
			
				System.out.printf("%4f",aver);
			System.out.println();
		}
	}
}
