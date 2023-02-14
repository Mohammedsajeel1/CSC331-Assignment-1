

public class Conversion {

	
	public void numberRepresentationForUserName(String name) {
		int i=0;
		int userNameAsciiValue = 0;
		while(i<name.length()) {
			int charAscii = (int)name.charAt(i);
			userNameAsciiValue = userNameAsciiValue + charAscii; 
			i++;
		}
		// binary Value
		System.out.print(name+"- binary value: "+Integer.toBinaryString(userNameAsciiValue));
		// hexa decimal value
		System.out.print(" , hexaDecimal value: "+Integer.toHexString(userNameAsciiValue));
		// octal value
		System.out.print(" , octal value: "+Integer.toOctalString(userNameAsciiValue));
	}
	// decimal conversion
	public void decimalToBinary(int decimal) {
		System.out.println(Integer.toBinaryString(decimal));
	}
	public void decimalToOctal(int decimal) {
		System.out.println(Integer.toOctalString(decimal));
	}
	public void decimaToHexaDecimal(int decimal) {
		System.out.println(Integer.toHexString(decimal));
	}
	
	// binary conversion
	public void binaryToDecimal(String binary) {
		System.out.println(Integer.parseInt(binary,2));
	}
	public void binaryToOctal(String binary) {
		int number = Integer.parseInt(binary,2);
		System.out.println(Integer.toOctalString(number));
	}
	public void binaryToHexaDecimal(String binary) {
		int number = Integer.parseInt(binary,2);
		System.out.println(Integer.toHexString(number).toUpperCase());
	}
	
	//hexa decimal conversion
	public void hexaToDecimal(String hexa) {
		System.out.println(Integer.parseInt(hexa,16));
	}
	public void hexaToOctal(String hexa) {
		int decimalNumberForHexa = Integer.parseInt(hexa,16);
		System.out.println(Integer.toOctalString(decimalNumberForHexa));
	}
	public void hexaToBinary(String hexa) {
		int decimalNumberForHexa = Integer.parseInt(hexa,16);
		System.out.println(Integer.toBinaryString(decimalNumberForHexa));
	}
	
	//octal conversion
	public void octalToDecimal(String octalInput) {
		System.out.println(Integer.parseInt(octalInput,8));
	}
	public void octalToHexaDecimal(String octalNumber) {
		int decimalValue = Integer.parseInt(octalNumber,8);
		String hexaDecimal = Integer.toHexString(decimalValue);
		System.out.println(hexaDecimal.toUpperCase());
	}
	public void octalToBinary(String octalNumber) {
		int decimalValue = Integer.parseInt(octalNumber,8);
		String binaryOutput = Integer.toBinaryString(decimalValue);
		System.out.println(binaryOutput);
	}
}
