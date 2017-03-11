# Write `code`

Open your terminal, and `cd` to the directory of your choosing. Then create your code file:

	$ touch JavaCode.java

Open `JavaCode.java` with your preferred text editor and include the following code:

	public class JavaCode {

		public static void main(String args []) {
			System.out.println("Hello World");
		}

	}

Compile your code; enter into your terminal:

	$ javac JavaCode.java

Run our code; enter into your terminal:

	$ java JavaCode

A simple java program. Pretty exciting!

## An if then statement (`if(){}`)

	public class JavaIfThen {
		public static void main(String [] args) {
			int x = 5;
			int z = 10;

			if (x + z == 15) {
				System.out.println("x + z = 15");
			}
		}
	}

Your terminal will indeed print `x + z = 15` because the statement `x + z == 15` is `True`.

## A while loop (`while(){}`)

	public class JavaWhileLoop {
		public static void main(String [] args){
			int i = 0;
			while (i < 8) {
				System.out.println("The value of i is: " + i);
				i++;
			}
		}
	}

This will print to the terminal eight iterations of the value of the variable of type `int`, with values from `0` to `7` iterating by `1`.

---

# Java is Object-Oriented

Java rocks the following object-oriented features:

* Polymorphism
* Inheritance
* Encapsulation
* Abstraction

## Objects

Objects are instantiations of classes and have **states** & **behaviors**.

## Classes

Classes can be thought of as blueprints that describe the state & behavior for the objects they create. 

Class example:

	public class MyClass {
		
		String state_1;	
		int state_2;
		void method_1(){
		}
		void method_2(){
		}

	}

Classes can contain any of these variable types:

* Local variables
* Instance variables
* Class variables

## Constructors

Every class has at least a constructor. Constructors are invoked when a class is instantiated to create an object.

Constructor example:

	public class MyConstructor{

		public MyConstructor(){
		}
		public MyConstructor(String name){
			// This constructor takes one parameter.
		}

	}

There are three main steps to creating an object:

* Declaration
* Instantiation
* Initialization

## Variables

Variables are reserved memory for storing values. There are two data types:

* Primitive data types
* Object data types

### Primitives

**boolean**

* Description: **true or false**
* Default: `false`
* Size: **1 bit**
* Example literals: `true`, `false`

**byte**

* Description: **twos complement integer**
* Default:  `0`
* Size:  **8 bits**
* Example literals: **(none)**

**char**

* Description: **Unicode character**
* Default:  `\u0000`
* Size:  ****
* Example literals: `'a'`, `'\u0041'`, `'\\'`

**short**

* Description: **twos complement integer**
* Default:  `0`
* Size:  **16 bits**
* Example literals: **(none)**

**int**

* Description: **twos complement integer**
* Default:  `0`
* Size:  **32 bits**
* Example literals: `-2`, `-1`, `0`, `1`, `2`

**long**

* Description: **twos complement integer**
* Default:  `0`
* Size:  **64 bits**
* Example literals: `-2L`, `-1L`, `0L`, `1L`, `2L`

**float**

* Description: **IEEE 754 floating point**
* Default:  `0.0`
* Size:  **32 bits**
* Example literals: `1.23e100f`, `-1.23e-100f`, `.3f`, `3.14F`

**double**

* Description: **IEEE 754 floating point**
* Default:  `0.0`
* Size:  **64 bits**
* Example literals: `1.23456e300d`, `-1.23456e-300d`, `1e1d`

---

# Operators

## Arithmetic

`+`

* addition

`-`

* subtraction

`*`

* multiplication

`/`

* division

`%`

* modulus

`++`

* increment

`--`

* decrement

## Relational

`==`

* equal to

`!=`

* not equal to

`>`

* greater than

`<`

* less than

`>=`

* greater than or equal to

`<=`

* less than or equal to