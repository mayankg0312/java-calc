import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		iterate it;
		boolean exit = false;
		Scanner scanner = new Scanner(System.in);
		
		while (!exit) {
			System.out.println("Select an option:");
			System.out.println("1. Sum");
			System.out.println("2. Subtract");
			System.out.println("3. Multiplication ");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			
			int option = scanner.nextInt();
		
			switch (option) {
				case 1:
					it = askNumber();
					it.sum();
					break;
				case 2:
					it = askNumber();
					it.subtract();
					break;
				case 3:
					it = askNumber();
					it.multiply();
					break;
				case 4:
					it = askNumber();
					it.divide();
					break;
				case 5:
					System.out.println("Thank You!!");
					exit = true;
					break;
				default:
					System.out.println("Wrong option try again.");
			}
		}
		scanner.close();
	}
	
	public static iterate askNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number one : ");
		double num1 = scan.nextDouble();
		System.out.print("Enter number two : ");
		double num2 = scan.nextDouble();
		return new iterate(num1, num2);
	}
	
}
