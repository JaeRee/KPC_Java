package T_Collage;
import java.util.Arrays;

// arr �迭�� 10, 30, 25 ���� ����Ǿ� �ְ�
// �ִ밪/�ּڰ��� ���ϴ� ���α׷�

public class T7_ArrP2 {
	
	public static void main(String[] args) {
		
		int arr[] = {10, 30, 25};
		
		System.out.println("arr �迭�� ���Ҵ� "+Arrays.toString(arr)+"�Դϴ�.");
		
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
		System.out.println("�ִ밪�� "+max+"�̰�, �ּҰ��� "+min+"�Դϴ�.");
	}

}
