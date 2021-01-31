package controlFlow;

import java.util.Scanner;

public class Main {

	private static Scanner userInput;

	public static void main(String[] args) {
		
		System.out.println("Numbers:");
		AsciiChars.printNumbers();
		System.out.println("Lowercase letters:");
		AsciiChars.printLowerCase();
		System.out.println("Uppercase letters:");
		AsciiChars.printUpperCase();

		userInput = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String inputName = userInput.nextLine();
		System.out.printf("Hello %s/n", inputName);
	
		System.out.println("Do you wish to continue the interactive portion? (y/n)");
		String userResponse = userInput.nextLine();
		
		if(userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")); {	
		
		} else {
			System.out.printf("Okay %s, please return later to complete the survery. Have a nice day.\n", inputName);
			userInput.close();
			System.exit(0);
		}
		
		userInput.close();
	
	}
}
