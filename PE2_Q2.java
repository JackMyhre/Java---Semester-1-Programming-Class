package Chapter3;
//Help received: None -Jack Myhre
import java.util.Scanner;
public class PE2_Q2 {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("My Calculator");
		System.out.println("---------------");
		
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Regular Division");
		System.out.println("5. Integer Division");
		System.out.println("6. Mod");
		System.out.println("Enter your choice (1 - 6)");
		
		double choice = input.nextDouble();
		
		double addition = 1;
		double subtraction = 2;
		double multiplication = 3;
		double regularDivision = 4;
		double integerDivision = 5;
		double mod = 6;
		
		System.out.println("Enter number 1");
		double numberOne = input.nextDouble();
				
		System.out.println("Enter nummber 2");
		double numberTwo = input.nextDouble();
		
		
		if(choice == 1) {
			double additionAnswer = numberOne + numberTwo;
			System.out.print(numberOne + " + " + numberTwo + " = " + additionAnswer);
			}
		else if(choice == 2) {
			double subtractionAnswer = numberOne - numberTwo;
			System.out.print(numberOne + " - " + numberTwo + " = " + subtractionAnswer);
			}
		else if(choice == 3) {
			double multiplicationAnswer = numberOne * numberTwo;
			System.out.print(numberOne + " * " + numberTwo + " = " + multiplicationAnswer);
			}
		else if(choice == 4) {
			double regularDivisionAnswer = numberOne / numberTwo;
			System.out.print(numberOne + " / " + numberTwo + " = " + regularDivisionAnswer);
			}
		else if(choice == 5) {
			
			double integerDivisionAnswer = numberOne / numberTwo;
			System.out.print(numberOne + " / " + numberTwo + " = " + integerDivisionAnswer);
			}
		else if(choice == 6) {
			double modAnswer = numberOne % numberTwo;
			System.out.print(numberOne + " % " + numberTwo + " = " + modAnswer);
			}
	}
}
