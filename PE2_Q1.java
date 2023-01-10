package Chapter3;
//Help Received: None -Jack Myhre
import java.util.Scanner;
public class PE2_Q1 {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter values for a, b, and c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double discriminant = Math.pow(b, 2) - (4 * a * c);
		
		if (discriminant >0) {
			double r1 = -b + (Math.sqrt(discriminant)) / 2 * a;
			double r2 = -b - (Math.sqrt(discriminant)) / 2 * a;
			System.out.print("r1 = " + r1 + " and r2 = " + r2);
			
		}
		else if (discriminant == 0) {
			double r = -b / 2 * a;
			System.out.print("root = " + r);
			}
		else if (discriminant < 0){
			System.out.println("The equation has no real roots");
		}
	}
}

