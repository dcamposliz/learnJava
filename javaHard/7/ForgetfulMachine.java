import java.util.Scanner;

public class ForgetfulMachine {
	public static void main( String[] args ){
		Scanner keyboard = new Scanner(System.in);

		System.out.println("What city is the capital of France?");
		keyboard.next();

		System.out.println("What is 6 multiplied by 7?");
		keyboard.nextInt();

		System.out.println("Enter a number between 0.0 and 1.0:");
		keyboard.nextDouble();

		System.out.println("Is there anything else you would like to say?");
		keyboard.next();
	}
}

// at the top of this file we are importing the package "java.util.Scanner"
// that allows us to get input from users

// we create a scanner object called "keyboard", to which we assign
// super-powers, namely, the method Scanner(System.in)

// next() -- expects a string
// nextInt() -- expects an integer
// nextDouble() -- expects a double
//
// 		these are actual methods stemming from Scanner(System.in)
//		these expect their respective data types as input from the user
//		if these do not get what they expect, they freak out

// next we get to store human inputs