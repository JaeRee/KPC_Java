package T_Collage;

public class T5_Arr {
	
	public static void main(String[] args) {
		
		int i, j, arr1[][] = new int[5][3]; // 5행3열
		
		int[][] arr2 = new int[][]{{1,2,3},{2,3,4},{3,4,5}}; // 3행3열
		int[] arr3[] = {{1,2},{2,3,4,5},{3,4,5}}; // 가변행열
		
		
		// 2차원 배열 arr1.length 하면   ★ 행이나옴
		// 2차원 배열 arr1[1].length 하면 ★ 열이나옴
		
		for(i=0; i<arr2.length; i++) {//  행제어 0,1,2,3,4
			
			for(j=0; j<arr2[i].length;j++) {//  행제어 0,1,2
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
			
		}
		
		
	}

}
