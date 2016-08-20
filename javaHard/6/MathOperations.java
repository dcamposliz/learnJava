public class MathOperations {
	public static void main( String[] args ){
		int a, b, c, d, e, f, g;
		double x, y, z;
		String one, two, both;

		a = 10;
		b = 27;
		System.out.println("a is: " + a + ", b is: " + b);

		c = a + b;
		System.out.println("a + b is: " + c);
		d = a - b;
		System.out.println("a - b is: " + d);
		e = a + b * 3;
		System.out.println("a + b * 3 is: " + e);
		f = b / 2;
		System.out.println("b / 2 is: " + f);
		g = b % 10;
		System.out.println("b % 10 is: " + g);

		x = 1.1;
		System.out.println("\nx is: " + x);
		y = x * x;
		System.out.println("x * x is: " + y);
		z = b / 2;
		System.out.println("b / 2 is: " + z);
		System.out.println();

		one = "dog";
		two = "house";
		both = one + two;
		System.out.println(both);

		int aNumber;
		double anotherNumber;

		aNumber = 2 + 3;
		anotherNumber = 2.2 + 4.4;

		System.out.println("Here is " + aNumber);
		System.out.println("Here is " + anotherNumber);
	}
}

// the plus sign (+) will add integers or doubles together
// it will also concatenate strings

// other operations will work as expected

// we get limited precision when working with doubles

