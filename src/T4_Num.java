//	543212345
//	 4321234
//	  32123
//	   212
//		1

public class T4_Num {
	
	public static void main(String[] args) {
		
		for(int i=1 ; i<=5 ; i++) {			//Çà
			
			for(int j=1 ; j<i ; j++) {		//ºóÄ­
				System.out.print(" ");
			}
			for(int j=6-i; j>=1 ; j--) {	//54321
				System.out.print(j);
			}
			for(int j=2 ; j<=6-i ; j++) {
				System.out.print(j);
			}
				
			System.out.println();
		}
	}
}
