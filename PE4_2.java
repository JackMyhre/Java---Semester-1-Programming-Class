package ProgramEvals;
//Help received: Dr. Lasisi --Jack Myhre
public class PE4_2 {

	public static void main(String[] args) {
		
	
		int lines = 9;
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= lines-i; j++) 
				System.out.print(" ");
			for(int j = i; j >= 1; j--) 
					System.out.print(i + "");
			
			
			System.out.println();
		
		}
	}
}
