import java.util.Scanner;

public class LabNumber4 {

	public static void main(String[] args) {

		// Lab 4 Table of Powers
		// Alex Nouhan
		// Grand Circus 2019

		// Call scanner and greet user

		Scanner scan = new Scanner(System.in);

		char userChar = 'y';

		System.out.println("Learn your square and cubes!");
		System.out.println();

		// Main loop body

		do {

			//prompt user for integer
			System.out.print("Enter an integer: ");

			int userInt = scan.nextInt();
			
			//table header formatting
			System.out.printf("%-10s", "Number");
			System.out.printf("%-10s", "Squared");
			System.out.printf("%-10s", "Cubed");
			System.out.print("\n");
			System.out.printf("%-10s", "======");
			System.out.printf("%-10s", "=======");
			System.out.printf("%-10s", "=====");
			System.out.println();
			
			//populate table
			for (int i = 1; i <= userInt; i++) {
				System.out.printf("%-10d", i);
				System.out.printf("%-10d", square(i));
				System.out.printf("%-10d", cube(i));
				System.out.println();
			}
			
			// ask to continue
			System.out.println();
			System.out.print("Continue? (y/n): ");
			do {
				userChar = scan.next().charAt(0);
				userChar = Character.toLowerCase(userChar);

				if (userChar != 'y' && userChar != 'n') {
					System.out.println();
					System.out.print("Please, try again! (y/n): ");
				}

			} while (userChar != 'y' && userChar != 'n');

		} while (userChar == 'y');
		
		//end program
		System.out.println();
		System.out.println("Goodbye!");
		scan.close();
	}

	public static int square(int num) {
		return num * num;
	}

	public static int cube(int num) {
		return num * num * num;
	}
}
