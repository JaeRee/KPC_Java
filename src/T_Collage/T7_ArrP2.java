package T_Collage;
import java.util.Arrays;

// arr 배열에 10, 30, 25 으로 저장되어 있고
// 최대값/최솟값을 구하는 프로그램

public class T7_ArrP2 {
	
	public static void main(String[] args) {
		
		int arr[] = {10, 30, 25};
		
		System.out.println("arr 배열의 원소는 "+Arrays.toString(arr)+"입니다.");
		
		int max, min = 0;
		int temp=0;
		
		for(int i=0 ; i<arr.length ; i++) {
			
			for(int j =0 ; j<i ; j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;					
				}
			}
		}
		max = arr[2];
		min = arr[0];
		System.out.println("최대값은 "+max+"이고, 최소값은 "+min+"입니다.");
	}

}
