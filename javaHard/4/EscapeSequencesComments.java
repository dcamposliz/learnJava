public class EscapeSequencesComments {
	public static void main ( String[] args ) {
		// this exercise demonstrates escape sequences & comments
		System.out.print("Learn\tJava\n\tthe\nHard\tWay\n\n");
		System.out.print("\tLearn Java the \"Hard\" Way!\n");
		// this is a single-line comment
		System.out.print("Hello\n"); // this line prints Hello
		System.out.print("Jello\by\n"); // this line prints Jelly
		/*	This is a multi-line comment.
			Yay! */
		System.out /* testing */.println("Hard to believe, eh?");
		System.out.println("Surprised? /* abcde */ Or what did you expect?");
		System.out.println("\\ // -=- // \\");
		System.out.println("\\\\ \\\\\\ \\\\\\\\"); // it takes 2 to make 1
		System.out.print("I hope you understand \"escape sequences\" now.\n");
	}
}
// we write comments to express why code is there 
// instead of what the code does