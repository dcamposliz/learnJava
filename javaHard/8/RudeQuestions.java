import java.util.Scanner;

public class RudeQuestions {
	public static void main( String[] args ){
		String name;
		int age;
		double weight, income;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Hello. What is your name? ");
		name = keyboard.next();

		System.out.print("Hi, " + name + "! How old are you? " );
		age = keyboard.nextInt();

		System.out.println("So you are " + age + ", eh? That is not very old.");
		System.out.print("How much do you weigh, " + name + "? ");
		weight = keyboard.nextDouble();

		System.out.println(weight + "!? Better keep that quiet!!");
		System.out.print("Finally, what's your income, " + name + "? ");
		income = keyboard.nextDouble();

		System.out.print("Hopefully that is " + income + " per hour");
		System.out.println(" and that's not per year!");
		System.out.print("Well, thanks for answering my rude questions, ");
		System.out.println(name + ".");

	// study drill stuff
		String hey;
		System.out.println("Tell me something interesting :)");
		hey = keyboard.next();
		System.out.println("Alright, I guess " + "'" + hey + "'" + " is kind of interesting");
	}
}

// entering integers as input when the program 
// expects doubles will not break the program.
// It will simply convert such integer into a double.

// dont think program will blow up if entering integer or double
// when program expects string
// CORRECT

// entering operator signs breaks the program when it is expecting
// strings

// on the other hand, it's easy to break for integers and floats (doubles)