

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Conversion convertor = new Conversion();
		System.out.println("Please Enter your name: ");
		String name = sc.nextLine();
		
		convertor.numberRepresentationForUserName(name);
		System.out.println("\n");
		for(int i=1;i>0;) {
			optionsMenu();
			try {
			int input = sc.nextInt();
			sc.nextLine();
			boolean breakTheLoop = processingInputs(input, convertor);
			if(breakTheLoop)
				break;
			}
			catch (Exception e) {
				System.out.println("Please choose between 1 and 5");
				sc.nextLine();
			}
		}
	
	}
	public static void optionsMenu() {
		System.out.println("------------------------------------------");
		System.out.println("Choose 1 for Decimal");
		System.out.println("Choose 2 for Binary");
		System.out.println("Choose 3 for Hexa_Decimal");
		System.out.println("Choose 4 for Octal");
		System.out.println("Choose 5 to Exit");
		System.out.println("------------------------------------------");
	}
	public static boolean processingInputs(int input, Conversion convertor) {
		
		if(input==5) {
			return true;
		}
		else if(input==1) {
			// convert decimal number to other format
			convertDecimalNumber(convertor);
			return false;
		}
		else if(input==2) {
			convertBinaryNumber(convertor);
			return false;
		}
		else if(input==3) {
			convertHexaDecimalNumber(convertor);
			return false;
		}
		else if(input==4) {
			convertOctalNumber(convertor);
			return false;
		}
		else {
			System.out.println("Invalid range of input...(Only 1 to 5 is allowed)");
			return false;
		}
	}
	public static void convertDecimalNumber(Conversion convertor) {
		Scanner sc = new Scanner(System.in);
		try {
			//input Decimal Number
			System.out.println("Please a Decimal Number to Convert");
			
			int number = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Octal-Number: ");
			convertor.decimalToOctal(number);
			
			System.out.println("Hexa_Decimal-Number: ");
			convertor.decimaToHexaDecimal(number);
			
			System.out.println("Binary-Number: ");
			convertor.decimalToBinary(number);
						
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid input for decimal, try again");
		}
		
	}
	public static void convertBinaryNumber(Conversion convertor) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a Binary Value to Convert");
			String binary = sc.nextLine();
			
			System.out.println("Decimal-Number: ");
			convertor.binaryToDecimal(binary);
			
			System.out.println("Octal-Number: ");
			convertor.binaryToOctal(binary);
			
			System.out.println("Hexa_Decimal-Number: ");
			convertor.binaryToHexaDecimal(binary);
			
		}
		catch(Exception e) {
			
		}
		
	}
	public static void convertHexaDecimalNumber(Conversion convertor) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a Hexa Decimal Number to Convert");
			String hex = sc.nextLine();
			
			System.out.println("Decimal-Number: ");
			convertor.hexaToDecimal(hex);
			
			System.out.println("Octal-Number: ");
			convertor.hexaToOctal(hex);
			
			System.out.println("Decimal-Number: ");
			convertor.hexaToBinary(hex);
			
		}
		catch(Exception e) {
			
		}
		
	}
	public static void convertOctalNumber(Conversion convertor) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a Octal Number to Convert");
			String oct = sc.nextLine();
			
			System.out.println("Decimal-Number: ");
			convertor.octalToDecimal(oct);
			
			System.out.println("Binary Number: ");
			convertor.octalToBinary(oct);
			
			System.out.println("Hexa Decimal Number: ");
			convertor.octalToHexaDecimal(oct);
		}
		catch(Exception e) {
			
		}
	
	}
}

