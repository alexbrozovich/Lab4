import java.util.Scanner;

public class Lab4 {
	
	//create a class that takes an integer and returns its factorial as a long
	public static long getFactorial(int userInt) {
		int factorial = 1;
		while (userInt > 0) {
			factorial *= userInt;
			userInt--;
		}
		return (long)factorial;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//set up the entire program to loop until the user asks to stop
		boolean keepGoing = true;
		while (keepGoing == true) {
		//set up the program to loop until the user inputs a valid integer
		boolean goodIn = false;
		int userInt = 0;
		while (goodIn == false) {
			System.out.println("Please enter an integer between 1-10: ");
			userInt = scan.nextInt();
			if (userInt <= 10 && userInt >= 1) {
				goodIn = true;
			} else {
				System.out.println("That integer is not between 1-10, please try again.");
			}
		}
		long factorial = getFactorial(userInt);
		System.out.printf("%d! is %d %n", userInt, factorial);
		System.out.println("Would you like to continue? y/n");
		char userContinue = scan.next().charAt(0);
		if (userContinue == 'y' || userContinue == 'Y') {
			keepGoing = true;
		}
		else {
			keepGoing = false;
			System.out.println("Bye!");
			scan.close();
		}
		}
	}

}
