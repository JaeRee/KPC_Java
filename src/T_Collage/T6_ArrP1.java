package T_Collage;
// 3���� ������ ���� ���� ���ϴ� ���α׷�
// ��ȣ ���� ���� ���� ����


public class T6_ArrP1 {
	
	public static void main(String[] args) {
		
		
		int[][] arr = {{90,98,78},{77,80,90},{60,90,100}};
		int sum=0, num=1;
		double aver = 0.0;
		
		System.out.println("< 3���� ������ ������ ���� ���ϴ� ���α׷�>\n");
		System.out.println("��ȣ\t����\t����\t����\t����\t���");
		
		
		for(int i=0; i<arr.length ; i++) {
			
			System.out.printf("%2d\t",num+i);
			
			
			for(int j=0; j<arr[i].length ; j++) {
				
				sum += arr[i][j];
				aver = (double)sum/3;
				
				System.out.printf("%3d\t",arr[i][j]);
			
				// �������� ���� ����
				}
				System.out.print(sum+"\t");
				sum=0;
			
				System.out.printf("%4f",aver);
			System.out.println();
		}
	}
}
