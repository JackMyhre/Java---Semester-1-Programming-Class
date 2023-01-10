package ProgramEvals;
//Help received: Dr. Lasisi --Jack Myhre
import java.util.Scanner;
public class PE4_1 {
	
	public static int findRange(int number) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int range = -1;
		
		while(number > 0) {
			
			int digitNumber = number % 10;
			if(digitNumber > max) {
			max = digitNumber;
			
			}
			else if (digitNumber < min) {
				min = digitNumber;
			}
			number /= 10;
			
		
			range = max - min + 1;
		}
		return range;
	}
		public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
			System.out.print("Enter a number: ");
		
						int number = input.nextInt();
		
					System.out.println("The range of the number " + number + " is " + findRange(number));

	}
}

