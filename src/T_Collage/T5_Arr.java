package T_Collage;

public class T5_Arr {
	
	public static void main(String[] args) {
		
		int i, j, arr1[][] = new int[5][3]; // 5��3��
		
		int[][] arr2 = new int[][]{{1,2,3},{2,3,4},{3,4,5}}; // 3��3��
		int[] arr3[] = {{1,2},{2,3,4,5},{3,4,5}}; // �����࿭
		
		
		// 2���� �迭 arr1.length �ϸ�   �� ���̳���
		// 2���� �迭 arr1[1].length �ϸ� �� ���̳���
		
		for(i=0; i<arr2.length; i++) {//  ������ 0,1,2,3,4
			
			for(j=0; j<arr2[i].length;j++) {//  ������ 0,1,2
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
			
		}
		
		
	}

}
