package application;

public class App {

	/*
	 * Assigning values to variables.
	 * This is a multiline comment.
	 */
	
	// This is a single line comment.
	
	public static void main(String[] args) {
		
		int dogs = 8;
		int cats = 3;
		
		System.out.println("1. Dogs: " + dogs);
		System.out.println("1. Cats: " + cats);

		dogs = cats;
		cats = 10;
		
		/* Take the value assigned to cats
		 * and assign it to dogs.
		 * = is an assignment operator in this case,
		 * not an equality operator.
		 */
		
		System.out.println("2. Dogs: " + dogs);
		System.out.println("2. Cats: " + cats);
	}

}
