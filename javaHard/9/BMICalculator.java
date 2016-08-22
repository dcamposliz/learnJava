import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args ){
		Scanner keyboard = new Scanner(System.in);
		double m, kg, feet, inches, pounds, bmi;

		System.out.print("Your height (feet only): ");
		feet = keyboard.nextDouble();

		System.out.print("Remaining weight in inches: ");
		inches = keyboard.nextDouble();

		System.out.print("Your weight in pounds: ");
		pounds = keyboard.nextDouble();

		inches = inches + (feet * 12);

		m = (inches * 2.54)/100;
		kg = (pounds * 0.453592);

		bmi = kg / (m * m);

		System.out.println("Your BMI is " + bmi);
	}
}

// tasks:
	// 1) change input to inches and pounds
	// 2) update height feet and inches