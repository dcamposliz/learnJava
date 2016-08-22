public class VariableChangeShortcuts{
	public static void main ( String[] args ){
		int i, j, k;

		i = 5;
		j = 5;
		k = 5;
		System.out.println("i: " + i + "\tj: " + j + "\tk: " + k);
		i = i + 3;
		j = j - 3;
		k = k * 3;
		System.out.println("i: " + i + "\tj: " + j + "\tk: " + k + "\n");

		i = 5;
		j = 5;
		k = 5;
		System.out.println("i: " + i + "\tj: " + j + "\tk: " + k);
		i += 3;
		j -= 3;
		k *= 3;
		System.out.println("i: " + i + "\tj: " + j + "\tk: " + k + "\n");

		i = j = k = 5;
		System.out.println("i: " + i + "\tj: " + j + "\tk: " + k);
		i += 1;
		j -= 2;
		k *= 3;
		System.out.println("i: " + i + "\tj: " + j + "\tk: " + k + "\n");

		i = j = 5;
		System.out.println("i: " + i + "\tj: " + j);
		i =+ 1; // Oops!
		j =- 2;
		System.out.println("i: " + i + "\tj: " + j + "\n");

		i = j = 5;
		System.out.println("i: " + i + "\tj: " + j);
		i++;
		j--;
		System.out.println("i: " + i + "\tj: " + j + "\n");

	// study drills:

		// 1)
		i = 5;
		System.out.println("i: " + i);
		i -= 5;
		System.out.println("i: " + i);

		// 2)
		i = 5;
		System.out.println("i: " + i);
		i++;
		i++;
		i++;
		i++;
		i++;
		System.out.println("i: " + i);
	}
}

// line 32 is interesting, because at a closer look we can see 
// that it looks like this:		 i = +1;
// which makes the result we end up getting a lot more evident

/*
Study Drills
	
	1) Add code at the bottom that resets i’s value to 5. 
	Then, on the next line, use only -= to change i’s value to 0. 
	Then on the line after that display i’s new value on the screen.
	
	2) Add code below the other Study Drill that resets i’s value to 5, 
	then using only ++, change i’s value to 10 and display it again. 
	(It will take more than one line of code.)
*/