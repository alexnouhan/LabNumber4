import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		//multiplication table
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Multipication Table");
		System.out.println("===================");
		
		System.out.print("Enter an integer for size of table: ");
		int userInt = scan.nextInt();
		
		System.out.println();
		System.out.println("===================");
		System.out.println();
		
		System.out.print("    ");
		for (int i = 1; i <= userInt; i++) {
			System.out.printf("%-4d", i);
		}
		System.out.println();
		for (int j = 1; j <= userInt; j++) {
			System.out.printf("%-4d", j);
			for (int k = 1; k <=userInt; k++) {
				System.out.printf("%-4d", j * k);
			}
			System.out.println();
		}
		

	}

}
