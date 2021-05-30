package T_Collage;
// »ï°¢º°  1 3 5 7 9

public class T4_Star {
	
	public static void main(String[] args) {
		
		for(int i=0 ; i<5 ; i++) {

			
			for(int j=0 ; j<i ; j++) {
				System.out.print(" ");
			}
			
			for(int j=5 ; j>i ; j--) {
				System.out.printf("*");
			}
			for(int j=4 ; j>i ; j--) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}